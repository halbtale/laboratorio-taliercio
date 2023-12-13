import java.util.Scanner;

public class TextAnalyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TextContainer textContainer = new TextContainer();
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			textContainer.add(line);
		}
		
		TextContainer parsedTextContainer = textContainer.splitWords().onlyLetters().toLowerCase();
		
		System.out.println("Parole:");
		System.out.println(parsedTextContainer);
		System.out.println(parsedTextContainer.count());
		System.out.println(parsedTextContainer.min());
		System.out.println(parsedTextContainer.max());
		
		for (int i = 0; i<5;i++) {
			String word = parsedTextContainer.maxFrequency();
			parsedTextContainer = parsedTextContainer.remove(word);
			
			System.out.println(word);
		}
		
		in.close();
	}
}
