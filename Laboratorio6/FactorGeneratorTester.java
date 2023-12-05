import java.util.Scanner;

public class FactorGeneratorTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberToFactorize = 0;

        while (numberToFactorize <= 1) {
            System.out.print("Inserisci il numero da fattorizzare: ");
            numberToFactorize = in.nextInt();
        }

        in.close();

        FactorGenerator generator = new FactorGenerator(numberToFactorize);

        while (generator.hasNextFactor()) {
            System.out.println(generator.nextFactor());
        }
    }
}
