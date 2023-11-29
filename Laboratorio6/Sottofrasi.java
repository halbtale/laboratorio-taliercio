import java.util.Scanner;

public class Sottofrasi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean isSubstring = false; 
		
		System.out.println("Inserisci prima frase");
		String s1 = in.nextLine();
		
		System.out.println("Inserisci seconda frase");
		String s2 = in.nextLine();
		
		if (s1.length() > s2.length()) {
			isSubstring = checkIsSubstring(s1, s2);
		} else {
			isSubstring = checkIsSubstring(s2, s1);
		}
		
		if (isSubstring) {
			System.out.println("e' una sottostringa'");
		} else {
			System.out.println("non e' una sottostringa'");		
		}
	}
	
	public static boolean checkIsSubstring(String mainString, String possibleSubstring) {
		for (int mainStringStartIndex = 0; mainStringStartIndex<= mainString.length() - possibleSubstring.length(); mainStringStartIndex++) {
			boolean isSubstring = checkIsSubstring(mainString, possibleSubstring, mainStringStartIndex);
			if (isSubstring) return true;
		}
		return false;
	}
	
	public static boolean checkIsSubstring(String mainString, String possibleSubstring, int mainStringStartIndex) {
		for (int i = 0; i < possibleSubstring.length(); i++) {
			if (mainString.charAt(i + mainStringStartIndex) != possibleSubstring.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
