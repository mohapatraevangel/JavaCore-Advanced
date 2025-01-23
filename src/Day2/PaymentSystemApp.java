package Day2;

// Payable.java - Interface defining the method that both Employee and Invoice should implement
interface Payable {
    void getPayment(); // Method to display payment details
}

// Employee.java - Class representing Employee that implements Payable interface
class Employee implements Payable {
    private String name;
    private String employeeId;
    private double salary;

    // Constructor to initialize the employee details
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Implementing getPayment() to display employee details and total payment
    @Override
    public void getPayment() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Total Payment: $" + salary);
    }

    // Getter methods for employee details
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

// Invoice.java - Class representing Invoice that implements Payable interface
class Invoice implements Payable {
    private String invoiceNumber;
    private String description;
    private double amount;

    // Constructor to initialize the invoice details
    public Invoice(String invoiceNumber, String description, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.amount = amount;
    }

    // Implementing getPayment() to display invoice details and total payment
    @Override
    public void getPayment() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Description: " + description);
        System.out.println("Amount: $" + amount);
        System.out.println("Total Payment: $" + amount);
    }

    // Getter methods for invoice details
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

// PaymentSystemApp.java - Main class to test the system
public class PaymentSystemApp {
    public static void main(String[] args) {
        // Create objects for Employees
        Employee employee1 = new Employee("John Doe", "E123", 5000.00);
        Employee employee2 = new Employee("Jane Smith", "E124", 6000.00);

        // Create objects for Invoices
        Invoice invoice1 = new Invoice("INV001", "Consulting Service", 1500.00);
        Invoice invoice2 = new Invoice("INV002", "Web Development", 2000.00);

        // Display payment details for each employee and invoice
        System.out.println("Employee Payments:");
        employee1.getPayment();
        System.out.println();
        employee2.getPayment();
        System.out.println();

        System.out.println("Invoice Payments:");
        invoice1.getPayment();
        System.out.println();
        invoice2.getPayment();
    }
}