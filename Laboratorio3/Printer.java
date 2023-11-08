import java.util.Scanner;

public class Printer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci tre parole");
		String parola1 = in.next();
		String parola2 = in.next();
		String parola3 = in.next();
		
		System.out.println(parola2 + "\n" + parola1 + "\n" + parola3);
	}
}
