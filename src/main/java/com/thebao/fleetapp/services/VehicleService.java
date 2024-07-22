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
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    //Save new country
    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    //Get by id
    public Optional<Vehicle> findById(int id){
        return vehicleRepository.findById(id);
    }

    public void update(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public void deleteById(Integer id){
        vehicleRepository.deleteById(id);
    }
}
