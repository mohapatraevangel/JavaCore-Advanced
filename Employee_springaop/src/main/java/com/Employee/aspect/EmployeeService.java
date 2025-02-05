package com.Employee.aspect;

import com.Employee.persistence.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee addEmployee (Employee employee);
    public void deleteEmployee (int id);
    public void updateEmployee (int id, Employee employee);
    public Employee getEmployeeById(int id);

}
