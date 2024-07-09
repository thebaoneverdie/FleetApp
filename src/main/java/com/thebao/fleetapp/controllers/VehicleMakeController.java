package com.thebao.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
    @GetMapping("/vehiclemake")
    public String getVehicleMakes(){
        return "vehiclemake";
    }


}
