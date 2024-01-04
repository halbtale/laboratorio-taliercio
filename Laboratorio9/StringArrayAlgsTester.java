import java.util.Scanner;

public class StringArrayAlgsTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputs = new String[5];
        int inputsSize = 0;
        boolean shouldAskForInput = true;

        while (shouldAskForInput) {
            System.out.print("Inserisci una stringa: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("")) {
                shouldAskForInput = false;
            } else {
                inputs[inputsSize++] = input;
            }
        }

        System.out.print("Scegli algoritmo di ordinamento [B/M]: ");
        String algoritmoScelto = in.nextLine();

        if (algoritmoScelto.equalsIgnoreCase("B")) {
            StringArrayAlgs.bubbleSort(inputs, inputsSize);
        } else if (algoritmoScelto.equalsIgnoreCase("M")) {
            StringArrayAlgs.iterativeMergeSort(inputs, inputsSize);
        }

        boolean shouldAskForSearch = true;

        while (shouldAskForSearch) {
            System.out.print("Inserisci una stringa da cercare: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("")) {
                shouldAskForInput = false;
            } else {
                String searchValue = input;
                System.out.println("Si trova nella posizione: "+StringArrayAlgs.iterativeBinSearch(inputs, inputsSize, searchValue));
            }
        }

        in.close();
    }
}