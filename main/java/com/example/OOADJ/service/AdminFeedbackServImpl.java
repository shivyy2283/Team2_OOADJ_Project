package com.example.OOADJ.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OOADJ.model.AdminFeedback;

import com.example.OOADJ.repository.AdminFeedbackRepository;


@Service
public class AdminFeedbackServImpl implements AdminFeedbackService
{

    @Autowired
    private AdminFeedbackRepository adfeedRepository;
    @Override
    public List<AdminFeedback> getAllFeedback()
    {
        return adfeedRepository.findAll();

    }
    @Override
    public void deleteFeedbackById(int id)
    {
        this.adfeedRepository.deleteById(id);
    }
}
