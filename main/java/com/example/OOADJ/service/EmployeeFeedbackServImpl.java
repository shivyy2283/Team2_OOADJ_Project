package com.example.OOADJ.service;

import java.util.*;
import com.example.OOADJ.model.EmployeeFeedback;
import com.example.OOADJ.repository.EmployeeFeedbackRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class EmployeeFeedbackServImpl implements EmployeeFeedbackService
{
    @Autowired
    private EmployeeFeedbackRepository employeeRepository;

    @Override
    public List<EmployeeFeedback> getAllFeedback()
    {
        return employeeRepository.findAll();

    }

    @Override
    public void saveFeedback(EmployeeFeedback feedback)
    {
        this.employeeRepository.save(feedback);
    }
}

