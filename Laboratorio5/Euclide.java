import java.util.Scanner;

public class Euclide {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci primo numero: ");
		int m = in.nextInt();
		
		System.out.print("Inserisci secondo numero: ");
		int n = in.nextInt();
		
		int currentReminder = -1;
		
		while (currentReminder != 0 && m % n != 0) {
			currentReminder = m % n;
			m = n;
			n = currentReminder;
		}
		
		System.out.println(n);
		
	}
}
