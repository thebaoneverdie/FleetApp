package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Location;
import com.thebao.fleetapp.models.VehicleMake;
import com.thebao.fleetapp.repositories.LocationRepository;
import com.thebao.fleetapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    public List<VehicleMake> getVehicleMakes(){
        return vehicleMakeRepository.findAll();
    }

    public List<VehicleMake > findAll() {
        return vehicleMakeRepository.findAll();
    }

    public void save(VehicleMake  vehicleMake ){
        vehicleMakeRepository.save(vehicleMake );
    }

    //Get by id
    public Optional<VehicleMake> findById(int id){
        return vehicleMakeRepository.findById(id);
    }

    public void update(VehicleMake  vehicleMake ) {
        vehicleMakeRepository.save(vehicleMake );
    }

    public void deleteById(Integer id){
        vehicleMakeRepository.deleteById(id);
    }
}
