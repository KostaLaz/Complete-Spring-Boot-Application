package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    public List<Country> getAllCountries();
    public void addNewCountry(Country country);
    public void deleteCountry(Long id);
    public Optional<Country> findById(Long id);
}
