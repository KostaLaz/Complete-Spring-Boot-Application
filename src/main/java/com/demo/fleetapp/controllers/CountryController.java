package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.service.CountryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

    private CountryServiceImpl countryServiceImpl;

    public CountryController(CountryServiceImpl countryServiceImpl) {
        this.countryServiceImpl = countryServiceImpl;
    }

    @GetMapping("/countries")
    public String getAllCountries(Model model){
        List<Country> countryList = countryServiceImpl.getAllCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/countries/addnew")
    public String addNew(Country country){
        countryServiceImpl.addNewCountry(country);
        return "redirect:/countries";
    }

}
