package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.VehicleMovement;
import com.thebao.fleetapp.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {
    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    public List<VehicleMovement> getVehicleMovements(){
        return vehicleMovementRepository.findAll();
    }

    public List<VehicleMovement> findAll() {
        return vehicleMovementRepository.findAll();
    }

    //Save new country
    public void save(VehicleMovement vehicleMovement){
        vehicleMovementRepository.save(vehicleMovement);
    }



    //Get by id
    public Optional<VehicleMovement> findById(int id){
        return vehicleMovementRepository.findById(id);
    }

    public void update(VehicleMovement vehicleMovement) {
        vehicleMovementRepository.save(vehicleMovement);
    }

    public void deleteById(Integer id){
        vehicleMovementRepository.deleteById(id);
    }
}
