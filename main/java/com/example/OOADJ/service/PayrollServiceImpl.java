package com.example.OOADJ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OOADJ.model.Payroll;
import com.example.OOADJ.repository.PayrollRepository;

@Service
public class PayrollServiceImpl implements PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;

    @Override
    public List<Payroll> getAllEmployees() {
        return payrollRepository.findAll();
    }

    @Override
    public void saveEmployee(Payroll employee) {
        this.payrollRepository.save(employee);
    }

    @Override
    public List<Payroll> getEmployeeById(String userId, String payDay) {
        return payrollRepository.findByUserIdAndPayDay(userId, payDay);
    }

    @Override
    public List<Payroll> getPayrollByUsername(String username) {
        return payrollRepository.findByUsername(username);
    }

}
