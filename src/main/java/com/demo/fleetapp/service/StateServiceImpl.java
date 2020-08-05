package com.demo.fleetapp.service;

import com.demo.fleetapp.model.State;
import com.demo.fleetapp.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {
    
    private StateRepository stateRepository;

//    public StateServiceImpl(StateRepository stateRepository) {
//        this.stateRepository = stateRepository;
//    }

    @Override
    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    @Override
    public void addNewState(State State){
        stateRepository.save(State);
    }

    @Override
    public void deleteState(Long id) {
        stateRepository.deleteById(id);
    }

    @Override
    public Optional<State> findById(Long id) {
        return stateRepository.findById(id);
    }

}
