import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci la parola che vuoi verificare sia palindroma: ");
		String word = (in.nextLine()).toLowerCase();
		String reversedWord = "";
		
		for (int i = 0; i<word.length(); i++) {
			reversedWord = word.charAt(i) + reversedWord;
		}
		
		boolean isReversable = word.equals(reversedWord);
		
		if (isReversable) {
			System.out.println("La parola e' palindroma");
		} else {
			System.out.println("La parola non e' palindroma");
		}
		
		in.close();
	}
}
