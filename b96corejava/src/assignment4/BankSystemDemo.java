package assignment4;

public class BankSystemDemo {
    public static void main(String[] args) {
        // Create a new BankAccount instance
        BankAccount account = new BankAccount(12345, 1000.0);

        // Display initial balance
        account.displayBalance();

        // Attempt to deposit money
        try {
            account.deposit(500.0);
            System.out.println("Deposit successful.");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt to withdraw money with sufficient balance
        try {
            account.withdraw(200.0);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt to withdraw money with insufficient balance
        try {
            account.withdraw(1500.0);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt to deposit an invalid amount
        try {
            account.deposit(-50.0);
            System.out.println("Deposit successful.");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        // Attempt to withdraw an invalid amount
        try {
            account.withdraw(-20.0);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
