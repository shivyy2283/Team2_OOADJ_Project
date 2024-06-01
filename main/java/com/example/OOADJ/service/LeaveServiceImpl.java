package com.example.OOADJ.service;

import com.example.OOADJ.model.Leave;
import com.example.OOADJ.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LeaveServiceImpl implements LeaveService{
    @Autowired
    private LeaveRepository leaveRepository;

    @Override
    public List<Leave> getAllLeaves()
    {
        return leaveRepository.findAll();
    }

    @Override
    public void saveLeave(Leave leave)
    {
        this.leaveRepository.save(leave);
    }

    @Override
    public Leave getLeaveById(Long leaveId)
    {
        Optional<Leave> optional = leaveRepository.findById(leaveId);
        Leave leave = null;
        if(optional.isPresent())
        {
            leave = optional.get();
        }
        else
        {
            throw new RuntimeException("Leave ID not found :: " + leaveId);
        }
        return leave;
    }

}
