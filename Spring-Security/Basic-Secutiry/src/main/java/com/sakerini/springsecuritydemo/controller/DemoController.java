package com.sakerini.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/account")
    public String showAccountPage() {
        return "account";
    }

    @GetMapping("/leaders")
    public String showLeadersPage() {
        return "leader-form";
    }

    @GetMapping("/systems")
    public String showSystemsPage() {
        return "systems";
    }
}
