package com.demo.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
    @GetMapping("/user")
    public String getUser(){
        return "user";
    }
}
