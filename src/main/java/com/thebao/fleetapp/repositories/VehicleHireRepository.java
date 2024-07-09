package com.thebao.fleetapp.repositories;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer>{
}
