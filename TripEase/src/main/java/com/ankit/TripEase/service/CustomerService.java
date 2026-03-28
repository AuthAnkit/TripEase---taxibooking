package com.ankit.TripEase.service;

import com.ankit.TripEase.exception.CustomerNotFoundException;
import com.ankit.TripEase.model.Customer;
import com.ankit.TripEase.repository.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepositary customerRepositary;
    public Customer addCustomer(Customer customer) {
        return customerRepositary.save(customer);
    }


    public Customer getCustomer(int customerId) {
        Optional<Customer> getc =  customerRepositary.findById(customerId);
        if(getc.isEmpty()){
            throw new CustomerNotFoundException("Customer with id " + customerId + " not found");
        }
        return getc.get();
    }
}
