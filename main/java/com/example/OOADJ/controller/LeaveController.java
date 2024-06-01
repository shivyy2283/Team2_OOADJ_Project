package com.example.OOADJ.controller;

import com.example.OOADJ.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.OOADJ.model.Leave;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @GetMapping("/leaveA")
    public String leave_admin(Model model)
    {
        model.addAttribute("listLeaves",leaveService.getAllLeaves());
        return "leave_admin";
    }

    @GetMapping("/shownewleaveform")
    public String shownewleaveform(Model model)
    {
        Leave leave = new Leave();
        model.addAttribute("leave",leave);
        return "apply_leave";
    }

    @PostMapping("/saveLeave")
    public String saveLeave(@ModelAttribute("leave") Leave leave)
    {
        leave.setStatus(2);
        leaveService.saveLeave(leave);
        return "redirect:/front_page";
    }

    @GetMapping("/showLeaveFormForUpdate/{id}")
    public String updateLeave(@PathVariable(value = "id") long id, Model model)
    {
        Leave leave = leaveService.getLeaveById(id);
        model.addAttribute("leave",leave);
        return "update_leave";
    }

    @PostMapping("/saveUpdateLeave")
    public String saveUpdateLeave(@ModelAttribute("leave") Leave leave)
    {
        leaveService.saveLeave(leave);
        String id = leave.getUserId();
        return "redirect:/admin_index";
    }

    @GetMapping("/update_leave")
    public String update_leave(Model model)
    {
        Leave leave = new Leave();
        model.addAttribute("leave",leave);
        return "update_leave";
    }

}
