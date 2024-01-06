import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortedContainerTester {
    public static void main(String[] args) throws IllegalArgumentException, IOException {
        if (args.length != 2)
            throw new IllegalArgumentException();
        String inputFileName = args[0];
        String outputFileName = args[1];

        SortedContainer container = new SortedContainer();

        FileReader reader = new FileReader(inputFileName);
        Scanner scan = new Scanner(reader);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] result = line.split(":");
            String fullName = result[0];
            int id = Integer.parseInt(result[1]);
            container.add(new Student(fullName, id));
        }

        scan.close();
        reader.close();

        PrintWriter out = new PrintWriter(outputFileName);
        while (!container.isEmpty()) {
            out.println(container.removeMax());
        }
        out.close();
    }
}
