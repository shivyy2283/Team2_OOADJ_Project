package com.example.OOADJ.service;
import java.util.List;

import com.example.OOADJ.model.AdminAttendance;

public interface AdminAttendanceService
{
    List<AdminAttendance> getAllAttendance();
    AdminAttendance getAdminAttendanceById(String id);
    void saveAdminAttendance(AdminAttendance adatt);

}
