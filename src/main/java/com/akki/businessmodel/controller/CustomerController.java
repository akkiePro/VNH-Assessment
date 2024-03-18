package com.akki.businessmodel.controller;

import com.akki.businessmodel.model.Customer;
import com.akki.businessmodel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("newCustomer")
    public void newCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

}
