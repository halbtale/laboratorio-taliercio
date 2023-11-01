import java.util.Scanner;

public class NumberDisplayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero naturale di massimo 5 cifre");
        int inputNumber = in.nextInt();

        int digit5 = inputNumber % 10;
        int digit4 = (inputNumber / 10) % 10;
        int digit3 = (inputNumber / 100) % 10;
        int digit2 = (inputNumber / 1000) % 10;
        int digit1 = (inputNumber / 10000) % 10;

        System.out.printf("%d %d %d %d %d%n", digit1, digit2, digit3, digit4, digit5);
    }
}
