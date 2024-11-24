public abstract class Account implements BankOperations {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". Updated Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // La méthode withdraw sera définie dans les sous-classes
    @Override
    public abstract void withdraw(double amount) throws InsufficientFundsException;

    @Override
    public double getBalance() {
        return balance;
    }
}
