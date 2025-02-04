package Assignment2;

public class Account {
    protected String name;
    protected String accountNumber;
    protected double accountBalance;

    // Constructor to initialize account details
    public Account(String name, String accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to get the current balance (overridden in subclasses)
    public double getBalance() {
        return accountBalance;
    }
}

