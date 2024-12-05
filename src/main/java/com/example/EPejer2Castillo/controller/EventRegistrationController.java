/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EPejer2Castillo.controller;

import com.example.EPejer2Castillo.model.EventRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author casti
 */
@Controller
public class EventRegistrationController {

    @GetMapping("/event-registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("eventRegistration", new EventRegistration());
        return "event-registration";
    }

    @PostMapping("/event-registration")
    public String submitRegistration(@ModelAttribute EventRegistration eventRegistration, Model model) {
        model.addAttribute("eventRegistration", eventRegistration);
        return "registration-success";
    }
}
