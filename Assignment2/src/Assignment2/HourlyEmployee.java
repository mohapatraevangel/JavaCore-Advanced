package Assignment2;

public class HourlyEmployee extends EmployeeSal{
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(String name, int employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override the method to return weekly salary
    @Override
    public double getWeeklySalary() {
        return hourlyRate * hoursWorked;
    }

    // Method to increase hourly rate by a specific percentage
    public void increaseSalary(double percentage) {
        hourlyRate += hourlyRate * percentage / 100;
    }

}
