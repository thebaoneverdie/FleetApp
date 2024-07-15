package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.VehicleStatus;
import com.thebao.fleetapp.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> getVehicleStatus(){
        return  vehicleStatusRepository.findAll();
    }

    public List<VehicleStatus> findAll() {
        return  vehicleStatusRepository.findAll();
    }

    public void save(VehicleStatus  vehicleStatus){
         vehicleStatusRepository.save(vehicleStatus);
    }

    //Get by id
    public Optional< VehicleStatus> findById(int id){
        return  vehicleStatusRepository.findById(id);
    }

    public void update( VehicleStatus  vehicleStatus) {
         vehicleStatusRepository.save(vehicleStatus);
    }

    public void deleteById(Integer id){
         vehicleStatusRepository.deleteById(id);
    }
}
