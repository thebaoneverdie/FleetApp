package com.thebao.fleetapp.repositories;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
}
