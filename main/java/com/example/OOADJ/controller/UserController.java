package com.example.OOADJ.controller;

import com.example.OOADJ.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.OOADJ.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home()
    {
        return "front_page";
    }

    @GetMapping("/register_user")
    public String showHome(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }


    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        char userType = user.getUniqueId().charAt(0);
        String type = String.valueOf(userType); // Convert char to String
        user.setUserType(type);
        String username = user.getUserName();
        String uni = user.getUniqueId();
        if(Objects.equals(type, "A")) {
            return "redirect:/admin_index";
        }
        return "redirect:/user/" + uni;
    }

    @PostMapping("/log_user")
    public String log_user(@RequestParam String uniqueId, @RequestParam String password)
    {
        User randuser = userService.getUniqueId(uniqueId);
        Long userId = randuser.getUserId();
        boolean result = userService.loginUser(userId,password);

        if(result)
        {
            User loggedInUser = userService.getUserById(userId);
            String userType = loggedInUser.getUserType();
            String username = loggedInUser.getUserName();
            String uni = loggedInUser.getUniqueId();
            if(Objects.equals(userType, "A")) {
                return "redirect:/admin_index";

            }
            return "redirect:/user/" + uni;
        }
        else {
            return "redirect:/user_login?error=1";
        }
    }

    @GetMapping("/user_login")
    public String user_login()
    {
        return "user_login";
    }

    @GetMapping("/logout")
    public String logout()
    {
        return "front_page";
    }

}
