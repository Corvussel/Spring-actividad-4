/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author russe
 */
@Controller
public class FormController {

    @GetMapping("/index")
    public String showForm(Model model) {

        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {

        model.addAttribute("user", user);
        return "success";
    }
 
    
}
