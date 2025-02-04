package Assignment2;

import java.util.Scanner;

public class EmployeeRecordApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeRecordSystem system = new EmployeeRecordSystem();

        // Adding sample employees
        SalariedEmployee salariedEmployee = new SalariedEmployee("Alice", 101, 1500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob", 102, 25, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Charlie", 103, 50000, 10);

        system.addEmployee(salariedEmployee);
        system.addEmployee(hourlyEmployee);
        system.addEmployee(commissionEmployee);

        // Print weekly salaries of all employees
        system.printWeeklySalaries();

        // Increase salary by 10% for all salaried employees
        System.out.println("\nIncreasing salary for salaried employees by 10%...");
        system.increaseSalariedEmployeesSalary(10);

        // Print weekly salaries after increase
        system.printWeeklySalaries();

        // Increase hourly rate by 5% for all hourly employees
        System.out.println("\nIncreasing hourly rate for hourly employees by 5%...");
        system.increaseHourlyEmployeesSalary(5);

        // Print weekly salaries after increase
        system.printWeeklySalaries();

        // Increase commission percentage by 3% for all commission employees
        System.out.println("\nIncreasing commission percentage for commission employees by 3%...");
        system.increaseCommissionEmployeesSalary(3);

        // Print weekly salaries after increase
        system.printWeeklySalaries();

        scanner.close();
    }
}
