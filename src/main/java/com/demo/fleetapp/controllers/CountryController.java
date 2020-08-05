package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.service.CountryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/countries/countrybyid")
    @ResponseBody
    public Optional<Country> findById(Long id){
        return countryServiceImpl.findById(id);
    }

    @PostMapping("/countries/addnew")
    public String addNew(Country country){
        countryServiceImpl.addNewCountry(country);
        return "redirect:/countries";
    }

}
