package com.demo.fleetapp.service;

import com.demo.fleetapp.model.State;

import java.util.List;
import java.util.Optional;

public interface StateService {

    public List<State> getAllStates();
    public void addNewState(State state);
    public void deleteState(Long id);
    public Optional<State> findById(Long id);

}
