package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.InvoiceStatus;
import com.thebao.fleetapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class InvoiceStatusController {
    @Autowired
    private InvoiceStatusService invoiceStatusService;

    //Get All States
    @GetMapping("invoiceStatuses")
    public String findAll(Model model){
        model.addAttribute("invoiceStatuses", invoiceStatusService.findAll());
        return "invoiceStatus";
    }

    @RequestMapping("invoiceStatus/findById")
    @ResponseBody
    public Optional<InvoiceStatus> findById(Integer id)
    {
        return invoiceStatusService.findById(id);
    }

    //Add InvoiceStatus
    @PostMapping(value="invoiceStatuses/addNew")
    public String addNew(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatuses";
    }

    @RequestMapping(value="invoiceStatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatuses";
    }

    @RequestMapping(value="invoiceStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        invoiceStatusService.deleteById(id);
        return "redirect:/invoiceStatuses";
    }

}
