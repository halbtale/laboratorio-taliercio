import java.util.Scanner;

class Sottosequenze {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci sequenza principale");
		String sequenza = in.nextLine();
		
		System.out.println("Inserisci sottosequenza");
		String sottosequenza = in.nextLine();
		
		int lastIndex = 0;
		boolean isSottosequenza = true;
		
		// loop su ogni carattere della sottosequenza
		for (int i = 0; i < sottosequenza.length(); i++) {
			// estrai carattere attuale
			char currentCharacter = sottosequenza.charAt(i);
			
			boolean found = false;
			
			// cerca se il carattere e' nella sequenza principale
			while (!found) {
				if (lastIndex >= sequenza.length()) break;
				if (currentCharacter == sequenza.charAt(lastIndex)) {
					found = true;
				}
				
				lastIndex++;
			}
			
			if (!found) {
				isSottosequenza = false;
				break;
			}
		}
		
		if (isSottosequenza) {
			System.out.println("e' una sottosequenza");
		} else {
			System.out.println("non e' una sottosequenza");
		}
	}
}
