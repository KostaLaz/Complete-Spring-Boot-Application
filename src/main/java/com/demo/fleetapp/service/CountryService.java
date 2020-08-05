package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Country;

import java.util.List;

public interface CountryService {

    public List<Country> getAllCountries();
    public void addNewCountry(Country country);
    public void deleteCountry(Long id);
}
