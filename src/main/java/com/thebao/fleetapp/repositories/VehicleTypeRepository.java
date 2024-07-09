package com.thebao.fleetapp.repositories;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer>{
}
