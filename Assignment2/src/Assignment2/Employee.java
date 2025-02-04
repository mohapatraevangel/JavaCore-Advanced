package Assignment2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String  getName() {
        return getFirstName()+" "+getLastName();
    }

    public int  getAnnualSalary() {
        return getSalary()*12;
    }

    public int  raiseSalary(int percentage) {
        return getSalary()+getSalary()*percentage/100;
    }

    public String toString() {
        return "id="+getId()
                +" name="+getName()+
                " salary"+getSalary();
    }
}
