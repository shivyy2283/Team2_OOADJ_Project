package com.example.OOADJ.service;

import com.example.OOADJ.model.EmployeeFeedback;
import java.util.*;
public interface EmployeeFeedbackService
{
    List<EmployeeFeedback> getAllFeedback();
    void saveFeedback(EmployeeFeedback feedback);

}

