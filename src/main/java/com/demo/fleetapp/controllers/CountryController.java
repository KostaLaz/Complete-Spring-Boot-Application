package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.service.CountryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    private final CountryServiceImpl countryService;

    public CountryController(CountryServiceImpl countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/countries")
    public String getAllCountries(Model model){
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @RequestMapping(value ="/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country){
        countryService.addNewCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("/countries/countrybyid/")
    @ResponseBody
    public Optional<Country> findById(Long id){
        return countryService.findById(id);
    }

    @PostMapping("/countries/addnew")
    public String addNew(Country country){
        countryService.addNewCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(Long id){
        countryService.deleteCountry(id);
        return "redirect:/countries";
    }

}
