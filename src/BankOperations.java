public interface BankOperations {
    void deposit(double amount); // Méthode pour déposer de l'argent

    void withdraw(double amount) throws InsufficientFundsException; // Méthode pour retirer de l'argent

    double getBalance(); // Méthode pour obtenir le solde}
}