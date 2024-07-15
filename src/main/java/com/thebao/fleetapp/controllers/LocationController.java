package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Location;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.LocationService;
import com.thebao.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LocationController {
    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;

    @Autowired private LocationService locationService;

    //Get All States
    @GetMapping("locations")
    public String findAll(Model model){
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("locations", locationService.findAll());
        return "location";
    }

    @RequestMapping("locations/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id)
    {
        return locationService.findById(id);
    }

    //Add Location
    @PostMapping(value="locations/addNew")
    public String addNew(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/locations";
    }

    @RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        locationService.deleteById(id);
        return "redirect:/locations";
    }
}
