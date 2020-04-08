package com.sakerini.validationdemo.controllers;

import com.sakerini.validationdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping()
    public String showForm(Model theModel) {
        theModel.addAttribute("user", new User());
        return "user-login";
    }

    @RequestMapping("/process")
    public String processForm(@ModelAttribute ("user") User theUser) {
        return "user-login-process";
    }
}
