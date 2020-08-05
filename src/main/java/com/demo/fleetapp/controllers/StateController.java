package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.service.stateService;
import com.demo.fleetapp.service.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @GetMapping("/states")
    public String getPerson() {
        return "state";
    }

    private StateService stateService;
    

    @GetMapping("/countries")
    public String getAllCountries(Model model){
        List<Country> countryList = stateService.getAllCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @RequestMapping(value ="/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country){
        stateService.addNewCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping("/countries/countrybyid/")
    @ResponseBody
    public Optional<Country> findById(Long id){
        return stateService.findById(id);
    }

    @PostMapping("/countries/addnew")
    public String addNew(Country country){
        stateService.addNewCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteCountry(Long id){
        stateService.deleteCountry(id);
        return "redirect:/countries";
    }
}
