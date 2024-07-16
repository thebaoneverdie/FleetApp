package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    //Save new country
    public void save(Client client){
        clientRepository.save(client);
    }



    //Get by id
    public Optional<Client> findById(int id){
        return clientRepository.findById(id);
    }

    public void update(Client client) {
        clientRepository.save(client);
    }

    public void deleteById(Integer id){
        clientRepository.deleteById(id);
    }
}
