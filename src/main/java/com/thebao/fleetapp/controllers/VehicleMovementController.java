package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.VehicleMovement;
import com.thebao.fleetapp.services.LocationService;
import com.thebao.fleetapp.services.SupplierService;
import com.thebao.fleetapp.services.VehicleMovementService;
import com.thebao.fleetapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMovementController {
    @Autowired
    private VehicleMovementService vehicleMovementService;
    @Autowired private VehicleService vehicleService;
    @Autowired private LocationService locationService;

    //Get All VehicleMovementsF
    @GetMapping("vehicleMovements")
    public String findAll(Model model){
        model.addAttribute("vehicleMovements", vehicleMovementService.findAll());
        model.addAttribute("vehicles", vehicleService.getVehicles());
        model.addAttribute("suppliers", locationService.getLocations());
        return "vehicleMovement";
    }

    @RequestMapping("vehicleMovements/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(Integer id)
    {
        return vehicleMovementService.findById(id);
    }

    //Add VehicleMovement
    @PostMapping(value="vehicleMovements/addNew")
    public String addNew(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping(value="vehicleMovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping(value="vehicleMovements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleMovementService.deleteById(id);
        return "redirect:/vehicleMovements";
    }


}
