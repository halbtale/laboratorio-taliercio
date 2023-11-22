import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int maxNumber = 0;
		
		do {
			System.out.print("Inserisci numero massimo per cui vuoi generare numeri primi: ");
			maxNumber = in.nextInt();
		} while (maxNumber <= 1);
		
		for (int currentNumber = 2; currentNumber<= maxNumber; currentNumber++) {
			boolean isPrime = true;
			
			for (int i = 2; i<=Math.sqrt(currentNumber); i++) {
				if (currentNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
				System.out.println(currentNumber);
		}
		
		in.close();
	}
}
