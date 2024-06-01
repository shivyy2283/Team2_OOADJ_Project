package com.example.OOADJ.service;

import java.util.List;
import com.example.OOADJ.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(String id);
    void deleteEmployeeById(String id);
}
