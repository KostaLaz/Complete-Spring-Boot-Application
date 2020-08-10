package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Location;
import com.demo.fleetapp.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }


    @Override
    public List<Location> getAlllocations(){
        return locationRepository.findAll();
    }

    @Override
    public void addNewlocation(Location location){
        locationRepository.save(location);
    }

    @Override
    public void deletelocation(Long id) {
        locationRepository.deleteById(id);
    }

    @Override
    public Optional<Location> findById(Long id) {
        return locationRepository.findById(id);
    }

}
