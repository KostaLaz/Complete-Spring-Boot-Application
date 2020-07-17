package com.demo.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {
    @GetMapping("/vehicle")
    public String getUser(){
        return "vehicle";
    }
}
