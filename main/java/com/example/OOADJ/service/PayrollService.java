package com.example.OOADJ.service;

import java.util.List;

import com.example.OOADJ.model.Payroll;

public interface PayrollService {

    List<Payroll> getAllEmployees();
    void saveEmployee(Payroll employee);
    List<Payroll> getEmployeeById(String userId, String payDay);
    List<Payroll> getPayrollByUsername(String username);



}

