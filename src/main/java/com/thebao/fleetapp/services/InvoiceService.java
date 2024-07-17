package com.thebao.fleetapp.services;

import com.thebao.fleetapp.models.Invoice;
import com.thebao.fleetapp.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoices(){
        return invoiceRepository.findAll();
    }

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    //Save new country
    public void save(Invoice invoice){
        invoiceRepository.save(invoice);
    }



    //Get by id
    public Optional<Invoice> findById(int id){
        return invoiceRepository.findById(id);
    }

    public void update(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteById(Integer id){
        invoiceRepository.deleteById(id);
    }
}
