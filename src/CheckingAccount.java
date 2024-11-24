public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". Updated Balance: " + balance);
        }
    }
}
