import java.util.Scanner;

public class SottostringeFinder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci stringa 1: ");
		String string1 = in.nextLine();
		System.out.print("Inserisci stringa 2: ");
		String string2 = in.nextLine();
		
		String maxCommonSubstring = "";
		
		if (string1.length() > string2.length()) {
			maxCommonSubstring = findMaxCommonSubstringLength(string1, string2);
		} else {
			maxCommonSubstring = findMaxCommonSubstringLength(string2, string1);
		}
		
		System.out.println(maxCommonSubstring);
		
		
	}
	
	private static String findMaxCommonSubstringLength(String mainString, String subString) {
		int maxCommonSubstringLength = 0;
		String maxCommonSubstring = "";
		
		for (int mainStringStartIndex = 0; mainStringStartIndex<mainString.length(); mainStringStartIndex++) {
			int commonSubstringLength = 0;
			String currentCommonSubstring = "";
			for (int j = 0; j<subString.length(); j++) {
				char currentSubstringChar = subString.charAt(j);
				if (j+mainStringStartIndex > mainString.length() - 1) {
					break;
				} else if (currentSubstringChar == mainString.charAt(j+mainStringStartIndex)) {
					commonSubstringLength++;
					currentCommonSubstring += currentSubstringChar;
				} else if (commonSubstringLength > 0){
					break;
				}
			}
			
			if (commonSubstringLength > maxCommonSubstringLength) {
				maxCommonSubstringLength = commonSubstringLength;
				maxCommonSubstring = currentCommonSubstring;
			}
		}
		
		return maxCommonSubstring;
	}
}
