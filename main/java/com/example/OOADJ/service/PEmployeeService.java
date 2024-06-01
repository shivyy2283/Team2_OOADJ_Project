package com.example.OOADJ.service;

import java.util.List;

import com.example.OOADJ.model.PEmployee;

public interface PEmployeeService {
    List<PEmployee> getAllPEmployeess();
    PEmployee getEmployeeById(String userId);
    PEmployee getEmployeeByUsername(String username);
    List<PEmployee> findByUsernameStartingWith(String prefix);


}


