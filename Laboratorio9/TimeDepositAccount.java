class TimeDepositAccount extends SavingsAccount {
    private int limitedMonthsLeft;

    public TimeDepositAccount(double rate, int limitedMonthsLeft) {
        super(rate);
        this.limitedMonthsLeft = limitedMonthsLeft;
    }

    public TimeDepositAccount(double initialBalance, double rate, int limitedMonthsLeft) {
        super(initialBalance, rate);
        this.limitedMonthsLeft = limitedMonthsLeft;
    }

    public String toString() {
        return super.toString() + "[limitedMonthsLeft="+limitedMonthsLeft+"]";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && ((TimeDepositAccount) obj).limitedMonthsLeft == limitedMonthsLeft;
    }

    public void addInterest() {
        super.addInterest();
        if (limitedMonthsLeft > 0) limitedMonthsLeft--;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        if (limitedMonthsLeft > 0) {
            super.withdraw(20);
        }
    }

    public int getLimitedMonthsLeft() {
        return limitedMonthsLeft;
    }
}