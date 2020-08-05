package com.demo.fleetapp.controllers;

import com.demo.fleetapp.model.State;
import com.demo.fleetapp.service.StateServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    private final StateServiceImpl stateService;

    public StateController(StateServiceImpl stateService) {
        this.stateService = stateService;
    }


    @GetMapping("/states")
    public String getAllstates(Model model){
        List<State> StateList = stateService.getAllStates();
        model.addAttribute("states", StateList);
        return "state";
    }

    @RequestMapping(value ="/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(State State){
        stateService.addNewState(State);
        return "redirect:/states";
    }

    @RequestMapping("/states/statebyid/")
    @ResponseBody
    public Optional<State> findById(Long id){
        return stateService.findById(id);
    }

    @PostMapping("/states/addnew")
    public String addNew(State State){
        stateService.addNewState(State);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(Long id){
        stateService.deleteState(id);
        return "redirect:/states";
    }
}
