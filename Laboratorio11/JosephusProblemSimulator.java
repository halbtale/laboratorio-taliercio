import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JosephusProblemSimulator {
    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            throw new IllegalArgumentException();
        String filename = args[0];

        FileReader reader = new FileReader(filename);
        Scanner scan = new Scanner(reader);
        Queue childrenNames = new ArrayQueue();

        while (scan.hasNextLine()) {
            String child = scan.nextLine();
            childrenNames.enqueue(child);
        }

        scan.close();

        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci numero di sillabe: ");

        int k = in.nextInt();

        in.close();

        runSimulation(childrenNames, k);
    }

    private static void runSimulation(Queue childrenNames, int k) {
        while (!childrenNames.isEmpty()) {
            String eliminatedChild = eliminateChild(childrenNames, k);
            System.out.println(eliminatedChild);
        }
    }

    private static String eliminateChild(Queue childrenNames, int k) {
        for (int i = 0; i < k - 1; i++) {
            childrenNames.enqueue(childrenNames.dequeue());
        }
        String eliminatedChild = (String) childrenNames.dequeue();
        return eliminatedChild;
    }
}
