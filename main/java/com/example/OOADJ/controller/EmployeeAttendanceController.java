package com.example.OOADJ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.OOADJ.service.EmployeeAttendanceService;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeAttendanceController
{
    @Autowired
    private EmployeeAttendanceService empattService;
    @GetMapping("/empviewattendance/{id}")
    public String adminviewattendance(@PathVariable(value="id") String id, Model model)
    {
        model.addAttribute("listAttendance", empattService.getAllAttendance(id));
        return "empattendance";
    }

}

