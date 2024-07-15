package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.EmployeeType;
import com.thebao.fleetapp.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EmployeeTypeController {
    @Autowired
    private EmployeeTypeService employeeTypeService;

    //Get All States
    @GetMapping("employeeTypes")
    public String findAll(Model model){
        model.addAttribute("employeeTypes", employeeTypeService.findAll());
        return "employeeType";
    }

    @RequestMapping("employeeTypes/findById")
    @ResponseBody
    public Optional<EmployeeType> findById(Integer id)
    {
        return employeeTypeService.findById(id);
    }

    //Add EmployeeType
    @PostMapping(value="employeeTypes/addNew")
    public String addNew(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping(value="employeeTypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeTypes";
    }

    @RequestMapping(value="employeeTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        employeeTypeService.deleteById(id);
        return "redirect:/employeeTypes";
    }

}
