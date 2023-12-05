import java.util.Scanner;

public class PrimeNumberTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberInput = 0;

        while (numberInput < 1) {
            System.out.print("Inserisci il numero: ");
            numberInput = in.nextInt();
        }

        in.close();

        boolean isPrime = false;

        if (numberInput == 1) {
            isPrime = true;
        } else {
            FactorGenerator generator = new FactorGenerator(numberInput);
            int firstFactor = generator.nextFactor();

            if (firstFactor == numberInput)
                isPrime = true;
        }

        if (isPrime) {
            System.out.println("Il numero inserito è primo");
        } else {
            System.out.println("Il numero inserito non è primo");
        }
    }
}
