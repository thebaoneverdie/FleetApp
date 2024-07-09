package com.thebao.fleetapp.repositories;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer>{
}
