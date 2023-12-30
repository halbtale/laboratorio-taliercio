import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class SortedArrayTester {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String fileName = args[1];
        SortedArray sortedArray = new SortedArray();

        for (int i = 0; i<n; i++) {
            sortedArray.add((int) (Math.random() * n) + 1);
        } 

        System.out.println(sortedArray);
        System.out.println("Avg: "+sortedArray.avg());

        try (Scanner in = new Scanner(System.in)) {
            boolean shouldContinue = true;
            while (shouldContinue) {
                String input = in.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    shouldContinue = false;
                } else {
                    int number = Integer.parseInt(input);
                    int foundIndex = sortedArray.search(number);
                    if (foundIndex == -1 ) {
                        System.out.println("Numero non trovato");
                    } else {
                        System.out.println("Trovato in posizione: "+foundIndex);
                    }
                }
            }
        }

        try {
            PrintWriter out = new PrintWriter(fileName);
            while (!sortedArray.isEmpty()) {
                out.println(sortedArray.removeMax());
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}