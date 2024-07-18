package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Contact;
import com.thebao.fleetapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    //Save new country
    public void save(Contact contact){
        contactRepository.save(contact);
    }



    //Get by id
    public Optional<Contact> findById(int id){
        return contactRepository.findById(id);
    }

    public void update(Contact contact) {
        contactRepository.save(contact);
    }

    public void deleteById(Integer id){
        contactRepository.deleteById(id);
    }
}
