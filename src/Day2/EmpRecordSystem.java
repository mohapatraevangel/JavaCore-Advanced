package Day2;
import java.util.ArrayList;

class Employee {
    String name;
    String employeeId;

    // Constructor
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public double getWeeklySalary() {
        return 0.0;  // Default implementation (it will be overridden)
    }
    public void increaseSalary(double percentage) {
        double currentSalary = getWeeklySalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        System.out.println(name + " (ID: " + employeeId + ") new salary: $" + newSalary);
    }
}
class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String name, String employeeId, double weeklySalary) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getWeeklySalary() {
        return weeklySalary;
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String name, String employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getWeeklySalary() {
        return hourlyRate * hoursWorked;
    }
}
class CommissionEmployee extends Employee {
    double sales;
    double commissionRate;

    public CommissionEmployee(String name, String employeeId, double sales, double commissionRate) {
        super(name, employeeId);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getWeeklySalary() {
        return (sales * commissionRate) / 100;
    }
}

// Main class to test the Employee Record System
public class EmpRecordSystem {
    public static void main(String[] args) {
        // Create employees
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "E001", 1000.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", "E002", 20.00, 40); // 40 hours
        CommissionEmployee commissionEmployee = new CommissionEmployee("Bob Brown", "E003", 5000.00, 10); // 10% commission

        // Store employees in an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);

        // Display weekly salaries
        System.out.println("Weekly Salaries:");
        for (Employee employee : employees) {
            System.out.println(employee.name + " (" + employee.employeeId + "): $" + employee.getWeeklySalary());
        }

        // Increase salary for each employee by a percentage
        System.out.println("\nIncreasing salary by 10% for all employees:");
        for (Employee employee : employees) {
            employee.increaseSalary(10);
        }
    }
}
