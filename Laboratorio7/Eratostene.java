import java.util.Arrays;
import java.util.Scanner;

public class Eratostene {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int MAX = in.nextInt();
		boolean[] primeArray = new boolean[MAX + 1];
		
		for (int i = 1; i<primeArray.length; i++) {
			primeArray[i] = true;
		}
		
		for (int i = 2; i<primeArray.length; i++) {
			if (primeArray[i]) {
				for (int j = i*2; j<primeArray.length; j+=i) {
					primeArray[j] = false;
				}
			}
		}
		
		System.out.println("I numeri primi trovati ");
		for (int i = 1; i<primeArray.length; i++) {
			if (primeArray[i]) {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
