package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.model.Location;
import com.demo.fleetapp.model.State;
import com.demo.fleetapp.service.CountryServiceImpl;
import com.demo.fleetapp.service.LocationServiceImpl;
import com.demo.fleetapp.service.StateServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

    private final LocationServiceImpl locationService;
    private final CountryServiceImpl countryService;
    private final StateServiceImpl stateService;

    public LocationController(LocationServiceImpl locationService, CountryServiceImpl countryService, StateServiceImpl stateService) {
        this.locationService = locationService;
        this.countryService = countryService;
        this.stateService = stateService;
    }


    @GetMapping("/locations")
    public String getAlllocations(Model model){
        List<Location> locationList = locationService.getAlllocations();
        model.addAttribute("locations", locationList);

        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);

        List<State> stateList = stateService.getAllStates();
        model.addAttribute("countries", stateList);

        return "location";
    }

    @RequestMapping(value ="/locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location){
        locationService.addNewlocation(location);
        return "redirect:/locations";
    }

    @RequestMapping("/locations/locationbyid/")
    @ResponseBody
    public Optional<Location> findById(Long id){
        return locationService.findById(id);
    }

    @PostMapping("/locations/addnew")
    public String addNew(Location location){
        locationService.addNewlocation(location);
        return "redirect:/locations";
    }

    @RequestMapping(value = "/locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deletelocation(Long id){
        locationService.deletelocation(id);
        return "redirect:/locations";
    }
}
