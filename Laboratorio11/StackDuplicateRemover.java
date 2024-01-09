import java.util.Scanner;

public class StackDuplicateRemover {
    public static void main(String[] args) {
        Stack s = new ArrayStack();

        populateStackByInput(s);

        removeDuplicates(s);

        printStack(s);

        System.out.println("DONE");
    }

    private static void populateStackByInput(Stack s) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un elenco di numeri sulla stessa riga");
        while (in.hasNextInt()) {
            s.push(in.nextInt());
        }

        in.close();
    }

    private static void removeDuplicates(Stack s) {
        boolean shouldIterate = true;
        int i = 0;

        while (shouldIterate) {
            int j = 0;
            Stack tempS = new ArrayStack();
            Object tempEl = null;

            while (!s.isEmpty()) {
                if (i == j) {
                    tempEl = s.top();
                    tempS.push(tempEl);
                }
                Object newEl = s.pop();
                if (tempEl == null || !newEl.equals(tempEl)) {
                    tempS.push(newEl);
                }
                j++;
            }

            if (tempEl == null)
                shouldIterate = false;

            while (!tempS.isEmpty()) {
                s.push(tempS.pop());
            }

            i++;

        }
    }

    private static void printStack(Stack s) {
        System.out.print("STACK: ");
        while (!s.isEmpty()) {
            System.out.print(s.pop());
            System.out.print(" ");
        }
        System.out.println("");
    }
}