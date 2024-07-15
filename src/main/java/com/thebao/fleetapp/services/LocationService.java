package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Location;
import com.thebao.fleetapp.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    //Save new country
    public void save(Location location){
        locationRepository.save(location);
    }



    //Get by id
    public Optional<Location> findById(int id){
        return locationRepository.findById(id);
    }

    public void update(Location location) {
        locationRepository.save(location);
    }

    public void deleteById(Integer id){
        locationRepository.deleteById(id);
    }

}
