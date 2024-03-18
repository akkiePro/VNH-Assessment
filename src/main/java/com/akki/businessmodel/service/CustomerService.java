package com.akki.businessmodel.service;

import com.akki.businessmodel.dao.CustomerRepository;
import com.akki.businessmodel.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public void addCustomer(Customer customer) {
        if ((customer.getDetails().getSex().equals("M") || customer.getDetails().getSex().equals("F")) && (customer.getContractType().equals("fulltime") || customer.getContractType().equals("parttime")))
            repo.save(customer);
        else
            throw new RuntimeException("data is not perfect");
    }

}
