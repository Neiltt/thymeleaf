package org.example.controller;

import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/register")
    public String init(Model model) {
        // user model init
        User user = new User();
        model.addAttribute("user", user);
        // web select init
        List<String> listProfession = Arrays.asList("Engineer", "Dentist", "Architect" ,"Singer" ,"Actor");
        model.addAttribute("listProfession", listProfession);

        return "registerForm";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "registerSuccess";
    }
}