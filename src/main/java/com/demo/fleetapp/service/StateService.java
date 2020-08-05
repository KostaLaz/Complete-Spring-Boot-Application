package com.demo.fleetapp.service;

import com.demo.fleetapp.model.State;

import java.util.List;
import java.util.Optional;

public interface StateService {

    public List<State> getAllstates();
    public void addNewstate(State state);
    public void deletestate(Long id);
    public Optional<State> findById(Long id);

}
