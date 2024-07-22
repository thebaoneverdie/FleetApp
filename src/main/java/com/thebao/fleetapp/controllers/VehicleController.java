package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Vehicle;
import com.thebao.fleetapp.services.VehicleService;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
    @Autowired private CountryService countryService;
    @Autowired private StateService stateService;

    //Get All Vehicles
    @GetMapping("vehicles")
    public String findAll(Model model){
        model.addAttribute("vehicles", vehicleService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return "vehicle";
    }

    @RequestMapping("vehicles/findById")
    @ResponseBody
    public Optional<Vehicle> findById(Integer id)
    {
        return vehicleService.findById(id);
    }

    //Add Vehicle
    @PostMapping(value="vehicles/addNew")
    public String addNew(Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleService.deleteById(id);
        return "redirect:/vehicles";
    }

}
