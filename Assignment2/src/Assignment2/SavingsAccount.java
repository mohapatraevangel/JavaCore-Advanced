package Assignment2;

public class SavingsAccount extends Account {
    private double interestRate;
    private double maxWithdrawAmount;
    private final double minimumBalance = 5000;

    // Constructor
    public SavingsAccount(String name, String accountNumber, double accountBalance) {
        super(name, accountNumber, accountBalance);
        this.interestRate = 5; // 5% interest rate
        this.maxWithdrawAmount = accountBalance;
    }

    // Method to calculate the balance after adding interest (does not modify the balance)
    @Override
    public double getBalance() {
        // Adding interest to the account balance and returning the total
        double interest = accountBalance * interestRate / 100;
        return accountBalance + interest;
    }

    // Method to withdraw money (checks for the minimum balance)
    public void withdraw(double amount) {
        if (amount <= maxWithdrawAmount && (accountBalance - amount) >= minimumBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Either amount exceeds max withdrawal limit or balance falls below minimum.");
        }
    }
}
