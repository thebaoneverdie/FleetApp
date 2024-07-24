package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Employee;
import com.thebao.fleetapp.models.Employee;
import com.thebao.fleetapp.repositories.EmployeeRepository;
import com.thebao.fleetapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    //Save new country
    public void save(Employee employee){
        employeeRepository.save(employee);
    }


    //Get by id
    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }

    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteById(Integer id){
        employeeRepository.deleteById(id);
    }

}
