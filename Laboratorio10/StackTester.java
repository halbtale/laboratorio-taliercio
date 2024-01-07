import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class StackTester {
    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            throw new IllegalArgumentException();
        Scanner in = new Scanner(System.in);

        Stack stack = new ArrayStack();
        while (in.hasNext()) {
            stack.push(in.next());
        }

        in.close();

        PrintWriter writer = new PrintWriter(args[0]);

        while (!stack.isEmpty()) {
            writer.println(stack.pop());
        }

        writer.close();
    }
}
