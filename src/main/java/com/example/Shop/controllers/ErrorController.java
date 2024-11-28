package com.example.Shop.controllers;

import com.example.Shop.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ErrorController {
    @GetMapping("/access-denied")
    public String accessDenied(Model model) {
        model.addAttribute("user", new User());
        return "access-denied";
    }
}
