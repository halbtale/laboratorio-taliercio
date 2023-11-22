import java.util.Scanner;

public class Factorize {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberToFactorize = 0;
		
		do {
			System.out.print("Inserisci numero positivo: ");
			numberToFactorize = in.nextInt();
		} while (numberToFactorize < 1);
		
		int initialNumber = numberToFactorize;
		int[] factors = new int[numberToFactorize]; // il numero di fattori e' sicuramente minore del numero stesso
		int factorsSize = 0;
		
		while (numberToFactorize > 2) {
			for (int i = 2; i<=numberToFactorize; i++) {
				int reminder = numberToFactorize % i;
				if (reminder == 0) {
					numberToFactorize = numberToFactorize / i;
					factors[factorsSize] = i;
					factorsSize++;
					break;
				}
			}
		}
		
		System.out.print(numberToFactorize + " = ");
		
		for (int i = 0; i<factorsSize; i++) {
			System.out.print(factors[i] + " * ");
		}
		
		System.out.print("\b\b");
		
		
		in.close();
	}
}
