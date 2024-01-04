public class BankAccount
{
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {   
        deposit(initialBalance);
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException();
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (amount > balance || amount <= 0)
            throw new IllegalArgumentException();
        balance = balance - amount;
    }

    public void transfer(double amount, BankAccount other)
    { 
        withdraw(amount);
        other.deposit(amount);
    }


    // ------- metodi di accesso --------

    public double getBalance()
    {   
        return balance;
    }


    // ------ metodi di Object da sovrascrivere ---------
    // ......... toString e equals ......................
    public String toString() {
        return getClass().getName() + "[balance="+balance+"]";
    }

    public boolean equals(Object obj) {
        BankAccount otherBankAccount = (BankAccount) obj;
        return otherBankAccount.balance == this.balance;
    }



    // -------- campi di esemplare ---------

    private double balance;
}
