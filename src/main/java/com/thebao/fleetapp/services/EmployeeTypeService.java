package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.EmployeeType;
import com.thebao.fleetapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getEmployeeTypes(){
        return employeeTypeRepository.findAll();
    }

    public List<EmployeeType > findAll() {
        return employeeTypeRepository.findAll();
    }

    public void save(EmployeeType  employeeType ){
        employeeTypeRepository.save(employeeType );
    }

    //Get by id
    public Optional<EmployeeType> findById(int id){
        return employeeTypeRepository.findById(id);
    }

    public void update(EmployeeType  employeeType ) {
        employeeTypeRepository.save(employeeType );
    }

    public void deleteById(Integer id){
        employeeTypeRepository.deleteById(id);
    }
}
