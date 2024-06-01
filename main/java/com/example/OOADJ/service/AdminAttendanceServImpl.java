package com.example.OOADJ.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OOADJ.model.AdminAttendance;
import com.example.OOADJ.repository.AdminAttendanceRepository;

@Service

public class AdminAttendanceServImpl implements AdminAttendanceService
{
    @Autowired
    private AdminAttendanceRepository adattRepository;
    @Override

    public List<AdminAttendance> getAllAttendance()
    {
        return adattRepository.findAll();

    }
    @Override
    public void saveAdminAttendance(AdminAttendance adatt)
    {
        this.adattRepository.save(adatt);
    }
    @Override
    public AdminAttendance getAdminAttendanceById(String id) {
        Optional < AdminAttendance > optional = adattRepository.findById(id);
        AdminAttendance adat = null;
        if (optional.isPresent()) {
            adat = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return adat;
    }

}
