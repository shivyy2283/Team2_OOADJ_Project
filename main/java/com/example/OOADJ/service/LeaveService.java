package com.example.OOADJ.service;

import com.example.OOADJ.model.Leave;
import java.util.*;

public interface LeaveService {
    List<Leave> getAllLeaves();
    void saveLeave(Leave leave);
    Leave getLeaveById(Long leaveId);
}
