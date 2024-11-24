public class BusinessAccount extends Account {
    private static final double TRANSACTION_FEE = 2.50;

    public BusinessAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        double totalAmount = amount + TRANSACTION_FEE;
        if (totalAmount > balance) {
            throw new InsufficientFundsException("Insufficient funds including transaction fee.");
        } else {
            balance -= totalAmount;
            System.out.println("Withdrew: " + amount + " with transaction fee of " + TRANSACTION_FEE + ". Updated Balance: " + balance);
        }
    }
}
