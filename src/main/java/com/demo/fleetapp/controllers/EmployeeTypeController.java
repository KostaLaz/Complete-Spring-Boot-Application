package com.demo.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
    @GetMapping("/employee_type")
    public String getEmployeeType(){
        return "employee_type";
    }
}
