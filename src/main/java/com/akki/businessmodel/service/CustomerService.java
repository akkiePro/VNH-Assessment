package com.akki.businessmodel.service;

import com.akki.businessmodel.dao.CustomerRepository;
import com.akki.businessmodel.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public void addCustomer(Customer customer) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date customerDate = formatter.parse(customer.getDetails().getDob());
        Date limitationDate = formatter.parse("01-01-2002");
        if ((customer.getDetails().getSex().equals("M") || customer.getDetails().getSex().equals("F")) && (customer.getContractType().equals("fulltime") || customer.getContractType().equals("parttime")) && (customerDate.compareTo(limitationDate) > 0))
            repo.save(customer);
        else
            throw new RuntimeException("data is not perfect");
    }

}
