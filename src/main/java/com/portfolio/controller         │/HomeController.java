package com.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Your Name");
        model.addAttribute("phone", "9876543210");
        model.addAttribute("email", "your@email.com");
        return "index";
    }
}