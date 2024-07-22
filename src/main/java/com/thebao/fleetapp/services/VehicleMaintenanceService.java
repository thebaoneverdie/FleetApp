package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.VehicleMaintenance;
import com.thebao.fleetapp.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {
    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;

    public List<VehicleMaintenance> getVehicleMaintenances(){
        return vehicleMaintenanceRepository.findAll();
    }

    public List<VehicleMaintenance> findAll() {
        return vehicleMaintenanceRepository.findAll();
    }

    //Save new country
    public void save(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    //Get by id
    public Optional<VehicleMaintenance> findById(int id){
        return vehicleMaintenanceRepository.findById(id);
    }

    public void update(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    public void deleteById(Integer id){
        vehicleMaintenanceRepository.deleteById(id);
    }
}
