package Assignment2;
import java.util.ArrayList;

public class EmployeeRecordSystem {

    private ArrayList<EmployeeSal> employees;

    // Constructor to initialize the employee list
    public EmployeeRecordSystem() {
        employees = new ArrayList<>();
    }

    // Method to add an employee to the list
    public void addEmployee(EmployeeSal employee) {
        employees.add(employee);
    }

    // Method to calculate the weekly salary of all employees
    public void printWeeklySalaries() {
        for (EmployeeSal employee : employees) {
            System.out.println(employee.name + " (ID: " + employee.employeeId + ") - Weekly Salary: " + employee.getWeeklySalary());
        }
    }

    // Method to increase the salary of salaried employees by a specific percentage
    public void increaseSalariedEmployeesSalary(double percentage) {
        for (EmployeeSal employee : employees) {
            if (employee instanceof SalariedEmployee) {
                ((SalariedEmployee) employee).increaseSalary(percentage);
                System.out.println("Increased salary of " + employee.name + " by " + percentage + "%");
            }
        }
    }

    // Method to increase the salary of hourly employees by a specific percentage
    public void increaseHourlyEmployeesSalary(double percentage) {
        for (EmployeeSal employee : employees) {
            if (employee instanceof HourlyEmployee) {
                ((HourlyEmployee) employee).increaseSalary(percentage);
                System.out.println("Increased hourly rate of " + employee.name + " by " + percentage + "%");
            }
        }
    }

    // Method to increase the salary of commission employees by a specific percentage
    public void increaseCommissionEmployeesSalary(double percentage) {
        for (EmployeeSal employee : employees) {
            if (employee instanceof CommissionEmployee) {
                ((CommissionEmployee) employee).increaseSalary(percentage);
                System.out.println("Increased commission percentage of " + employee.name + " by " + percentage + "%");
            }
        }
    }
}
