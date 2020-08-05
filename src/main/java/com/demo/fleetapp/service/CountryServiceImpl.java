package com.demo.fleetapp.service;

import com.demo.fleetapp.model.Country;
import com.demo.fleetapp.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public void addNewCountry(Country country){
        countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }


}
