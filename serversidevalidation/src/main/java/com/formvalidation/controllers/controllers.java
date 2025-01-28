package com.formvalidation.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.formvalidation.UserData;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class controllers {
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("userData", new UserData());
        return "form";
    }

    @PostMapping("/process")
    public String processData(@Valid @ModelAttribute("userData") UserData userData, BindingResult result) {
        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(userData);
        return "success";
    }
    
    
}
