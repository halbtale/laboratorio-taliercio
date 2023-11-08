import java.util.Scanner;
import java.util.Locale;

public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//in.useLocale(Locale.ITALY);
		
		System.out.println("Inserisci primo numero:");
		double n1 = in.nextDouble();
		
		System.out.println("Inserisci secondo numero:");
		double n2 = in.nextDouble();
		
		System.out.println("Inserisci terzo numero:");
		double n3 = in.nextDouble();
		
		System.out.printf("%f + %f + %f = %f", n1, n2, n3, n1+n2+n3);
		
		in.close(); 
	}
}
