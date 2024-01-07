import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class QueueTester {
    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            throw new IllegalArgumentException();

        Scanner in = new Scanner(System.in);

        Queue queue = new ArrayQueue();

        while (in.hasNext()) {
            queue.enqueue(in.next());
        }

        in.close();

        PrintWriter writer = new PrintWriter(args[0]);

        while (!queue.isEmpty()) {
            writer.println(queue.dequeue());
        }

        writer.close();
    }
}
