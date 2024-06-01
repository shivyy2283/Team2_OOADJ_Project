package com.example.OOADJ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.OOADJ.model.AdminAttendance;
import com.example.OOADJ.service.AdminAttendanceService;

@Controller
public class AdminAttendanceController
{
    @Autowired
    private AdminAttendanceService adattService;
    @GetMapping("/adminviewattendance")
    public String adminviewattendance(Model model)
    {

        model.addAttribute("listAttendance", adattService.getAllAttendance());
        return "adminattendance";
    }
    @PostMapping("/saveAttendance")
    public String saveAttendance(@ModelAttribute("adminattendance") AdminAttendance adatt) {
        // save employee to database
        adattService.saveAdminAttendance(adatt);
        return "redirect:/admin_index";
    }
    @GetMapping("/showFormUpdate/{id}")
    public String showFormUpdate(@PathVariable ( value = "id") String id, Model model)
    {

        // get employee from the service
        AdminAttendance adat = adattService.getAdminAttendanceById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("adminattendance", adat);
        return "update_attendance";
    }
}

