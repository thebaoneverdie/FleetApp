package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.VehicleType;
import com.thebao.fleetapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {
    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    public List<VehicleType> getVehicleTypes(){
        return vehicleTypeRepository.findAll();
    }

    public List<VehicleType > findAll() {
        return vehicleTypeRepository.findAll();
    }

    public void save(VehicleType  vehicleType ){
        vehicleTypeRepository.save(vehicleType );
    }

    //Get by id
    public Optional<VehicleType> findById(int id){
        return vehicleTypeRepository.findById(id);
    }

    public void update(VehicleType  vehicleType ) {
        vehicleTypeRepository.save(vehicleType );
    }

    public void deleteById(Integer id){
        vehicleTypeRepository.deleteById(id);
    }
}
