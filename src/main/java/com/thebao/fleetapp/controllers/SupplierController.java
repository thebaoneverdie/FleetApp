package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Supplier;
import com.thebao.fleetapp.services.SupplierService;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired private CountryService countryService;
    @Autowired private StateService stateService;

    //Get All Suppliers
    @GetMapping("suppliers")
    public String findAll(Model model){
        model.addAttribute("suppliers", supplierService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        return "supplier";
    }

    @RequestMapping("suppliers/findById")
    @ResponseBody
    public Optional<Supplier> findById(Integer id)
    {
        return supplierService.findById(id);
    }

    //Add Supplier
    @PostMapping(value="suppliers/addNew")
    public String addNew(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value="suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value="suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        supplierService.deleteById(id);
        return "redirect:/suppliers";
    }

}
