package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Contact;
import com.thebao.fleetapp.services.ContactService;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {
    @Autowired private ContactService contactService;
    @Autowired private CountryService countryService;
    @Autowired private StateService stateService;

    //Get All Contacts
    @GetMapping("contacts")
    public String findAll(Model model){
        model.addAttribute("contacts", contactService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return "contact";
    }

    @RequestMapping("contacts/findById")
    @ResponseBody
    public Optional<Contact> findById(Integer id)
    {
        return contactService.findById(id);
    }

    //Add Contact
    @PostMapping(value="contacts/addNew")
    public String addNew(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="contacts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value="contacts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactService.deleteById(id);
        return "redirect:/contacts";
    }

}
