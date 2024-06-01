package com.example.OOADJ.service;

import java.util.*;

import com.example.OOADJ.model.AdminFeedback;

public interface AdminFeedbackService
{
    List<AdminFeedback> getAllFeedback();
    void deleteFeedbackById(int id);

}

