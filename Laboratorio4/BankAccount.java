public class BankAccount {
	private double balance;
	
	BankAccount() {
		this.balance = 0;
	}
	
	BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addInterest(double rate) {
		balance = balance * (rate / 100 + 1);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	} 
	
	public void withdraw(double amount) {
		if (amount > 0 && balance - amount > 0) {
			balance -= amount;
		}
	}
}
