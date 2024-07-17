package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Supplier;
import com.thebao.fleetapp.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers(){
        return supplierRepository.findAll();
    }

    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    //Save new country
    public void save(Supplier supplier){
        supplierRepository.save(supplier);
    }



    //Get by id
    public Optional<Supplier> findById(int id){
        return supplierRepository.findById(id);
    }

    public void update(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public void deleteById(Integer id){
        supplierRepository.deleteById(id);
    }
}
