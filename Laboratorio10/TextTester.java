import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class TextTester {
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        if (args.length != 1)
            throw new IllegalArgumentException();

        String filename = args[0];
        FileReader reader = new FileReader(filename);
        Scanner scan = new Scanner(reader);
        Text text = new Text();

        scan.useDelimiter("[\\p{javaWhitespace}\\p{Punct}]+");
        while (scan.hasNext()) {
            String newWord = scan.next();
            System.out.println(newWord);
            text.add(newWord);
        }
        scan.close();
        text.sort();

        Text setText = new Text();

        String previousWord = "";
        while (!text.isEmpty()) {
            String lastWord = text.removeLast();
            if (!previousWord.equals(lastWord)) {
                setText.add(lastWord);
                previousWord = lastWord;
            }
        }
        setText.sort();
        System.out.println(setText);
    }
}