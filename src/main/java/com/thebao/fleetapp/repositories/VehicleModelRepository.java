package com.thebao.fleetapp.repositories;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer>{
}
