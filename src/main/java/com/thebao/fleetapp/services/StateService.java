package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.State;
import com.thebao.fleetapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> getStates(){
        return stateRepository.findAll();
    }

    public List<State> findAll() {
        return stateRepository.findAll();
    }

    //Save new country
    public void save(State state){
        stateRepository.save(state);
    }



    //Get by id
    public Optional<State> findById(int id){
        return stateRepository.findById(id);
    }

    public void update(State state) {
        stateRepository.save(state);
    }

    public void deleteById(Integer id){
        stateRepository.deleteById(id);
    }


}
