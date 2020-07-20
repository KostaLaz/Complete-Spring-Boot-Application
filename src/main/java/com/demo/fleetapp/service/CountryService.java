package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public void addNewCountry(Country country){
        countryRepository.save(country);
    }
}
