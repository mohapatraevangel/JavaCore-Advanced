package Assignment2;

public class CurrentAccount extends Account {
    private String tradeLicenseNumber;
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String name, String accountNumber, double accountBalance, String tradeLicenseNumber, double overdraftLimit) {
        super(name, accountNumber, accountBalance);
        this.tradeLicenseNumber = tradeLicenseNumber;
        this.overdraftLimit = overdraftLimit;
    }

    // Method to get balance (no additional calculation needed)
    @Override
    public double getBalance() {
        return accountBalance;
    }

    // Method to withdraw money considering overdraft
    public void withdraw(double amount) {
        if (amount <= (accountBalance + overdraftLimit)) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Amount exceeds account balance + overdraft limit.");
        }
    }
}