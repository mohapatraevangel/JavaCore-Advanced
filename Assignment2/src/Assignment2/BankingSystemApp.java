package Assignment2;

import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to create an account
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Choose account type (1 for Savings, 2 for Current): ");
        int accountChoice = scanner.nextInt();
        Account account = null;

        if (accountChoice == 1) {
            // Savings Account
            System.out.println("Enter initial deposit for Savings Account: ");
            double initialDeposit = scanner.nextDouble();
            account = new SavingsAccount(name, accountNumber, initialDeposit);
        } else if (accountChoice == 2) {
            // Current Account
            System.out.println("Enter initial deposit for Current Account: ");
            double initialDeposit = scanner.nextDouble();
            System.out.println("Enter trade license number: ");
            String tradeLicenseNumber = scanner.next();
            System.out.println("Enter overdraft limit: ");
            double overdraftLimit = scanner.nextDouble();
            account = new CurrentAccount(name, accountNumber, initialDeposit, tradeLicenseNumber, overdraftLimit);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Deposit
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).withdraw(withdrawAmount);
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).withdraw(withdrawAmount);
                    }
                    break;
                case 3:
                    // Check Balance
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    // Exit
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}