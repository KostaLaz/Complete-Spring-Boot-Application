package com.demo.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
    @GetMapping("/index")
    public String goHome(){
        return "country";
    }
}
