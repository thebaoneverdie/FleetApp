package com.thebao.fleetapp.controllers;

import com.thebao.fleetapp.models.Invoice;
import com.thebao.fleetapp.services.ClientService;
import com.thebao.fleetapp.services.CountryService;
import com.thebao.fleetapp.services.InvoiceService;
import com.thebao.fleetapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    @Autowired private ClientService clientService;

    @Autowired private InvoiceStatusService invoiceStatusService;

    //Get All Invoices
    @GetMapping("invoices")
    public String findAll(Model model){
        model.addAttribute("invoices", invoiceService.findAll());
        model.addAttribute("clients", clientService.findAll());
        model.addAttribute("invoiceStatuses", invoiceStatusService.findAll());

        return "invoice";
    }

    @RequestMapping("invoices/findById")
    @ResponseBody
    public Optional<Invoice> findById(Integer id)
    {
        return invoiceService.findById(id);
    }

    //Add Invoice
    @PostMapping(value="invoices/addNew")
    public String addNew(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping(value="invoices/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoices";
    }

    @RequestMapping(value="invoices/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        invoiceService.deleteById(id);
        return "redirect:/invoices";
    }

}
