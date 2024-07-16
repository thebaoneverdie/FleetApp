package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Client;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.ClientService;
import com.thebao.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ClientController {
    @Autowired private ClientService clientService;
    @Autowired private CountryService countryService;

    @Autowired private StateService stateService;

    //Get All Clients
    @GetMapping("clients")
    public String findAll(Model model){
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return "client";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id)
    {
        return clientService.findById(id);
    }

    //Add Client
    @PostMapping(value="clients/addNew")
    public String addNew(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.deleteById(id);
        return "redirect:/clients";
    }
}
