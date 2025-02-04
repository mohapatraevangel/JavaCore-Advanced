package Assignment2;

public class SalariedEmployee extends EmployeeSal {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String name, int employeeId, double weeklySalary) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    // Override the method to return weekly salary
    @Override
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Method to increase the salary by a specific percentage
    public void increaseSalary(double percentage) {
        weeklySalary += weeklySalary * percentage / 100;
    }
}
