package com.example.OOADJ.service;

import org.springframework.stereotype.Service;

import com.example.OOADJ.model.PEmployee;
import com.example.OOADJ.repository.PEmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PEmployeeServiceImpl implements PEmployeeService {

    private final PEmployeeRepository pEmployeeRepository;

    public PEmployeeServiceImpl(PEmployeeRepository pEmployeeRepository) {
        this.pEmployeeRepository = pEmployeeRepository;
    }

    @Override
    public List<PEmployee> getAllPEmployeess() {
        return pEmployeeRepository.findAll();
    }

    @Override
    public PEmployee getEmployeeById(String userId) {
        Optional<PEmployee> optionalPEmployee = pEmployeeRepository.findById(userId);
        return optionalPEmployee.orElse(null);
    }



    @Override
    public PEmployee getEmployeeByUsername(String username) {
        return pEmployeeRepository.findByUsername(username);
    }

    @Override
    public List<PEmployee> findByUsernameStartingWith(String prefix) {
        return pEmployeeRepository.findByUsernameStartingWith(prefix);
    }
}
