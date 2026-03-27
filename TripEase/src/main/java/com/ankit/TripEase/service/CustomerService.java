package com.ankit.TripEase.service;

import com.ankit.TripEase.model.Customer;
import com.ankit.TripEase.repository.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepositary customerRepositary;
    public Customer addCustomer(Customer customer) {
        Customer savedCustomer = customerRepositary.save(customer);
        return savedCustomer;
    }
}
