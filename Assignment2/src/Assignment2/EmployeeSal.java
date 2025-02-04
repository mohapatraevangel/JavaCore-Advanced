package Assignment2;

public abstract class EmployeeSal {
    protected String name;
    protected int employeeId;

    // Constructor to initialize the employee details
    public EmployeeSal(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to be implemented by subclasses to calculate weekly salary
    public abstract double getWeeklySalary();
}

