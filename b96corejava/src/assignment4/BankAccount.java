package assignment4;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        balance -= amount;
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
