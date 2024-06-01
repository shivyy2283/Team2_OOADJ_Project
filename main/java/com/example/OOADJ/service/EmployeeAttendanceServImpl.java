package com.example.OOADJ.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OOADJ.model.EmployeeAttendance;
import com.example.OOADJ.repository.EmployeeAttendanceRepository;

@Service

public class EmployeeAttendanceServImpl implements EmployeeAttendanceService
{
    @Autowired
    private EmployeeAttendanceRepository empattRepository;
    @Override

    public List<EmployeeAttendance> getAllAttendance(String id)
    {
        String i=id;
        List<EmployeeAttendance> newl=empattRepository.findAll();
        List<EmployeeAttendance> matchingAttendance = newl.stream().filter(attendance -> (attendance.getUser_id().equals(i))).collect(Collectors.toList());
        return matchingAttendance;
    }
}

