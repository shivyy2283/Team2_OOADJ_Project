package com.example.OOADJ.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.OOADJ.model.PEmployee;
import com.example.OOADJ.model.Payroll;
import com.example.OOADJ.service.PayrollService;
import com.example.OOADJ.service.PEmployeeService;

@Controller
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @Autowired
    private PEmployeeService pEmployeeService;


    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @GetMapping("/payroll_management")
    public String viewHomePage(Model model) {
        // Retrieve all employees from the service
        List<PEmployee> allEmployees = pEmployeeService.getAllPEmployeess();

        // Create a list to store employees with user IDs starting with "E"
        List<PEmployee> employeesWithEUserId = new ArrayList<>();

        // Check the first character of each user ID
        for (PEmployee employee : allEmployees) {
            if (employee.getUserId().startsWith("E")) {
                employeesWithEUserId.add(employee);
            }
        }
        model.addAttribute("listEmployees", employeesWithEUserId);
        return "payroll_1.html";
    }

    //please work
    @GetMapping("/showNewEmployeeForm/{username}")
    public String showNewEmployeeForm(@PathVariable("username") String username, Model model) {

        PEmployee employeeData = pEmployeeService.getEmployeeByUsername(username);

        if (employeeData == null) {
            return "error";
        }

        //Auto filled fields
        Payroll payroll = new Payroll();
        payroll.setUserId(employeeData.getUserId());
        payroll.setUsername(employeeData.getUsername());
        payroll.setPosition(employeeData.getPosition());

        model.addAttribute("payroll", payroll);
        return "add_emp_salary";
    }


    @PostMapping("/save_employee")
    public String saveEmployee(@ModelAttribute("employee") Payroll employee) {
        payrollService.saveEmployee(employee);
        return "redirect:/payroll_management";
    }



    @GetMapping("/showPayrollDetails/{username}")
    public String showPayrollDetails(@PathVariable("username") String username, Model model) {
        List<Payroll> payrollList = payrollService.getPayrollByUsername(username);
        model.addAttribute("payrollList", payrollList);
        return "view_emp_salary";
    }

    @GetMapping("/showSalaryDetails/{username}")
    public String showSalaryDetails(@PathVariable("username") String username, Model model) {
        List<Payroll> payrollList = payrollService.getPayrollByUsername(username);
        model.addAttribute("payrollList", payrollList);
        return "employee_salary";
    }

}

