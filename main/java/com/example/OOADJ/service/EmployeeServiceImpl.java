package com.example.OOADJ.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OOADJ.model.Employee;
import com.example.OOADJ.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(String userid) {
        Optional<Employee> optional = employeeRepository.findById(userid);
        Employee employee;
        if (optional.isPresent()) {
            employee =  optional.get();
        } else {
            throw new RuntimeException(" Employee not found for userid :: " + userid);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(String userid) {
        this.employeeRepository.deleteById(userid);
    }
}

