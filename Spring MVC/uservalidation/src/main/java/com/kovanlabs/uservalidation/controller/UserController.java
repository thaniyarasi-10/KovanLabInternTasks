package com.kovanlabs.uservalidation.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.kovanlabs.uservalidation.model.UserModel;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/form")
    public String showForm(Model model) {

        model.addAttribute("userModel", new UserModel());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("userModel") UserModel userModel,
                             BindingResult result,
                             Model model) {

        if(result.hasErrors()){
            return "form";
        }

        model.addAttribute("msg","User registered successfully!");
        return "success";
    }

}