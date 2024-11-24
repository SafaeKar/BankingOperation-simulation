import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankOperations savings = new SavingsAccount("S12345", 1000);
        BankOperations business = new BusinessAccount("B12345", 5000);
        BankOperations checking = new CheckingAccount("C12345", 3000);

        while (true) {
            System.out.println("\n=== Banking Operations ===");
            System.out.println("1. View Savings Account Balance");
            System.out.println("2. View Business Account Balance");
            System.out.println("3. View Checking Account Balance");
            System.out.println("4. Deposit to Savings Account");
            System.out.println("5. Withdraw from Savings Account");
            System.out.println("6. Deposit to Business Account");
            System.out.println("7. Withdraw from Business Account");
            System.out.println("8. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();

            if (option == 8) {
                System.out.println("Exiting...");
                break;
            }

            double amount;
            switch (option) {
                case 1:
                    System.out.println("Savings Account Balance: " + savings.getBalance());
                    break;

                case 2:
                    System.out.println("Business Account Balance: " + business.getBalance());
                    break;

                case 3:
                    System.out.println("Checking Account Balance: " + checking.getBalance());
                    break;

                case 4:
                    System.out.print("Enter amount to deposit to Savings Account: ");
                    amount = scanner.nextDouble();
                    savings.deposit(amount);
                    break;

                case 5:
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    amount = scanner.nextDouble();
                    try {
                        savings.withdraw(amount);
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.print("Enter amount to deposit to Business Account: ");
                    amount = scanner.nextDouble();
                    business.deposit(amount);
                    break;

                case 7:
                    System.out.print("Enter amount to withdraw from Business Account: ");
                    amount = scanner.nextDouble();
                    try {
                        business.withdraw(amount);
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
