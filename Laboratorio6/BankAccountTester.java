import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        String command = "";
        Scanner in = new Scanner(System.in);

        BankAccount account = new BankAccount();

        do {
            System.out.println("Comando? (Q, B, D, W, A)");
            command = in.next();

            if (command.equalsIgnoreCase("B")) {
                double balance = account.getBalance();
                System.out.println("Saldo attuale: " + balance);
            } else if (command.equalsIgnoreCase("D")) {
                double moneyToDeposit = in.nextDouble();
                boolean result = account.deposit(moneyToDeposit);
                if (result) {
                    System.out.println("Versamento effettuato: " + moneyToDeposit);
                } else {
                    System.out.println("Versamento non corretto");
                }
            } else if (command.equalsIgnoreCase("W")) {
                double moneyToWithdraw = in.nextDouble();
                boolean result = account.withdraw(moneyToWithdraw);
                if (result) {
                    System.out.println("Prelievo effettualo: " + moneyToWithdraw);
                } else {
                    System.out.println("Prelievo non autorizzato");
                }
            } else if (command.equalsIgnoreCase("A")) {
                double interestRate = in.nextDouble();
                boolean result = account.addInterest(interestRate);
                if (result) {
                    System.out.println("Interessi calcolati e accreditati: " + interestRate);
                } else {
                    System.out.println("Interessi non validi");
                }
            }

        } while (!command.equalsIgnoreCase("Q"));

        in.close();

        System.out.println("Arrivederci");
    }
}
