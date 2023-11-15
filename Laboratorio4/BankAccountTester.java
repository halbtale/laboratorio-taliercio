import java.util.Scanner;

public class BankAccountTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci saldo iniziale");
		double saldoIniziale = in.nextDouble();
		
		System.out.println("Inserisci tasso interesse");
		double tassoInteresse =  in.nextDouble();
		
		BankAccount bankAccount = new BankAccount(saldoIniziale);
		
		bankAccount.addInterest(tassoInteresse);
		bankAccount.addInterest(tassoInteresse);
		
		System.out.println("Il tuo saldo e' "+bankAccount.getBalance());
		
		System.out.println("Di quanto vuoi effettuare il prelievo?");
		double importoPrelievo = in.nextDouble();
		
		bankAccount.withdraw(importoPrelievo);
		
		System.out.println("Il tuo saldo e' "+bankAccount.getBalance());
	}
}
