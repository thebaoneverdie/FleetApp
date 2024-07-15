package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.VehicleModel;
import com.thebao.fleetapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    public List<VehicleModel> getVehicleModels(){
        return vehicleModelRepository.findAll();
    }

    public List<VehicleModel > findAll() {
        return vehicleModelRepository.findAll();
    }

    public void save(VehicleModel  vehicleModel ){
        vehicleModelRepository.save(vehicleModel );
    }

    //Get by id
    public Optional<VehicleModel> findById(int id){
        return vehicleModelRepository.findById(id);
    }

    public void update(VehicleModel  vehicleModel ) {
        vehicleModelRepository.save(vehicleModel );
    }

    public void deleteById(Integer id){
        vehicleModelRepository.deleteById(id);
    }
}
