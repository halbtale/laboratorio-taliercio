import java.util.Scanner;

class Bisesto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci anno");
		int anno = in.nextInt();
		final int annoCalendarioGregoriano = 1582;
		
		boolean bisestile = false;
		if (anno >= 1582) {
			if (anno % 400 == 0) {
				bisestile = true;
			} else if (anno % 100 != 0 && anno % 4 == 0) {
				bisestile = true;
			}
		} else {
			if (anno % 4 == 0) {
				bisestile = true;
			}
		}
		
		if (bisestile) {
			System.out.println("L'anno e' bisestile'");
		} else {
			System.out.println("L'anno non e' bisestile'");
		}
		
		
		in.close();
		
		
	}
}
