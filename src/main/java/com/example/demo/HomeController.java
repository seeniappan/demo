package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("myvar", "says Praise the LORD to the people");
        return "index";
    }
}
