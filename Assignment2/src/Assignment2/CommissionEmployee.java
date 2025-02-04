package Assignment2;

public class CommissionEmployee extends EmployeeSal {
    private double sales;
    private double commissionPercentage;

    // Constructor
    public CommissionEmployee(String name, int employeeId, double sales, double commissionPercentage) {
        super(name, employeeId);
        this.sales = sales;
        this.commissionPercentage = commissionPercentage;
    }

    // Override the method to return weekly salary based on commission
    @Override
    public double getWeeklySalary() {
        return sales * commissionPercentage / 100;
    }

    // Method to increase commission percentage by a specific value
    public void increaseSalary(double percentage) {
        commissionPercentage += commissionPercentage * percentage / 100;
    }

}
