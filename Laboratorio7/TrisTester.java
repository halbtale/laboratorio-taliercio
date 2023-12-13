import java.util.Scanner;
import java.util.InputMismatchException;

public class TrisTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final char PLAYER_1 = 'X';
		final char PLAYER_2 = 'O';
		
		Tris game = new Tris();
		
		while(!game.isEnded(PLAYER_1, PLAYER_2)) {
			System.out.println(game);
			// mossa giocatore 1
			boolean valid1 = false;
			while (!valid1) {
				try {
					System.out.println("[Player 1] inserisci la mossa: ");
					String input = in.nextLine();
					Scanner scan = new Scanner(input);
					int newRow = scan.nextInt();
					int newCol = scan.nextInt();
					scan.close();
					
					boolean result = game.setCharInPosition(newRow, newCol, PLAYER_1);
					if (result) {
						valid1 = true;
					} else {
						System.out.println("[Attenzione] Posizione occupata");
					}
				} catch(InputMismatchException e) {
					System.out.println("[Attenzione] non hai inserito un numero");
					System.out.println(game);
				} catch(IllegalArgumentException e) {
					System.out.println("[Attenzione] posizione non nella scacchiera");
					System.out.println(game);
				}
			}
			
			System.out.println(game);
			
			if (!game.isEnded(PLAYER_1, PLAYER_2)) {
				// mossa giocatore 2
				boolean valid2 = false;
				while (!valid2) {
					try {
						System.out.println("[Player 2] inserisci la mossa: ");
						String input = in.nextLine();
						Scanner scan = new Scanner(input);
						int newRow = scan.nextInt();
						int newCol = scan.nextInt();
						scan.close();
						
						boolean result = game.setCharInPosition(newRow, newCol, PLAYER_2);
						if (result) {
							valid2 = true;
						} else {
							System.out.println("[Attenzione] Posizione occupata");
						}
					} catch(InputMismatchException e) {
						System.out.println("[Attenzione] non hai inserito un numero");
						System.out.println(game);
					} catch(IllegalArgumentException e) {
						System.out.println("[Attenzione] posizione non nella scacchiera");
						System.out.println(game);
					}
				}
			}
			
		}
		
		if (game.isWinning(PLAYER_1)) {
			System.out.println("Player 1 ha vinto");
		} else if (game.isWinning(PLAYER_2)) {
			System.out.println("Player 2 ha vinto");
		} else {
			System.out.println("Pari");
		}
		
		in.close();
	}
}
