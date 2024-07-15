package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.VehicleStatus;
import com.thebao.fleetapp.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService vehicleStatusService;

    //Get All States
    @GetMapping("vehicleStatuses")
    public String findAll(Model model){
        model.addAttribute("vehicleStatuses", vehicleStatusService.findAll());
        return "vehicleStatus";
    }

    @RequestMapping("vehicleStatuses/findById")
    @ResponseBody
    public Optional<VehicleStatus> findById(Integer id)
    {
        return vehicleStatusService.findById(id);
    }

    //Add VehicleStatus
    @PostMapping(value="vehicleStatuses/addNew")
    public String addNew(VehicleStatus vehicleStatus) {
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/vehicleStatuses";
    }

    @RequestMapping(value="vehicleStatuss/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleStatus vehicleStatus) {
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/vehicleStatuses";
    }

    @RequestMapping(value="vehicleStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleStatusService.deleteById(id);
        return "redirect:/vehicleStatuses";
    }

}
