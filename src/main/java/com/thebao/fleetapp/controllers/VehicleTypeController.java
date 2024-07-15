package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.VehicleType;
import com.thebao.fleetapp.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleTypeController {
    @Autowired
    private VehicleTypeService vehicleTypeService;

    //Get All States
    @GetMapping("vehicleTypes")
    public String findAll(Model model){
        model.addAttribute("vehicleTypes", vehicleTypeService.findAll());
        return "vehicleType";
    }

    @RequestMapping("vehicleTypes/findById")
    @ResponseBody
    public Optional<VehicleType> findById(Integer id)
    {
        return vehicleTypeService.findById(id);
    }

    //Add VehicleType
    @PostMapping(value="vehicleTypes/addNew")
    public String addNew(VehicleType vehicleType) {
        vehicleTypeService.save(vehicleType);
        return "redirect:/vehicleTypes";
    }

    @RequestMapping(value="vehicleTypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleType vehicleType) {
        vehicleTypeService.save(vehicleType);
        return "redirect:/vehicleTypes";
    }

    @RequestMapping(value="vehicleTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleTypeService.deleteById(id);
        return "redirect:/vehicleTypes";
    }

}
