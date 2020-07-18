package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {

    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(){
        return "country";
    }

    @GetMapping("/allcountries")
        public List<Country> getAllCountries(Model model){
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);
        return countryList;
    }

}
