package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Country;
import com.thebao.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    //Return list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    //Save new country
    public void save(Country country){
        countryRepository.save(country);
    }



    //Get by id
    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }

    public void update(Country country) {
        countryRepository.save(country);
    }

    public void deleteById(Integer id){
        countryRepository.deleteById(id);
    }
}
