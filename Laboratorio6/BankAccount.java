public class BankAccount {
	private double balance;
	private int accountNumber;
	private static int accountCount = 0;

	BankAccount() {
		this.balance = 0;
		accountNumber = accountCount++;
	}

	BankAccount(double balance) {
		this.balance = balance;
		accountNumber = accountCount++;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean addInterest(double rate) {
		if (rate > 0) {
			balance = balance * (rate / 100 + 1);
			return true;
		}

		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && balance - amount > 0) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
