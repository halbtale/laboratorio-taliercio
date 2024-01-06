import java.io.IOException;
import java.io.PrintWriter;

public class StudentContainerTester {
    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            throw new IllegalArgumentException();
        String inputFileName = args[0];
        String outputFileName = args[1];

        StudentContainer container = new StudentContainer(inputFileName);

        PrintWriter out = new PrintWriter(outputFileName);
        while (!container.isEmpty()) {
            out.println(container.removeMax());
        }
        out.close();
    }
}
