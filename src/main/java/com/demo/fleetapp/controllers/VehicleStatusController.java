package com.demo.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {
    @GetMapping("/vehicle_status")
    public String getUser(){
        return "vehicle_status";
    }
}
