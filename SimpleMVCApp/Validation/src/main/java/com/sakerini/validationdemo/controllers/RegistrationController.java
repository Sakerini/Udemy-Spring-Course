package com.sakerini.validationdemo.controllers;

import com.sakerini.validationdemo.entity.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/register")
    public String showPage(Model theModel) {

        User theUser = new User();

        theModel.addAttribute("user", theUser);

        return "user-form";
    }

    @RequestMapping("/process")
    public String processForm(
            @Valid @ModelAttribute("user") User theUser, BindingResult errorResults) {

        if (errorResults.hasErrors()) {
            return "user-form";
        }
        else {
            return "user-form-process";
        }
    }
}
