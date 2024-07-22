package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Vehicle;
import com.thebao.fleetapp.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository stateRepository;

    public List<Vehicle> getVehicles(){
        return stateRepository.findAll();
    }

    public List<Vehicle> findAll() {
        return stateRepository.findAll();
    }

    //Save new country
    public void save(Vehicle state){
        stateRepository.save(state);
    }

    //Get by id
    public Optional<Vehicle> findById(int id){
        return stateRepository.findById(id);
    }

    public void update(Vehicle state) {
        stateRepository.save(state);
    }

    public void deleteById(Integer id){
        stateRepository.deleteById(id);
    }
}
