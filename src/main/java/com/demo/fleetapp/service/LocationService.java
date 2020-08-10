package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {

    public List<Location> getAlllocations();


    public void addNewlocation(Location location);

    public void deletelocation(Long id);

    public Optional<Location> findById(Long id);

}
