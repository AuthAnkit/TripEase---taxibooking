package com.ankit.TripEase.service;

import com.ankit.TripEase.dto.request.CustomerRequest;
import com.ankit.TripEase.dto.response.CustomerResponse;
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


    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        //RequestDTO -> Entity
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAge(customerRequest.getAge());
        customer.setEmailId(customerRequest.getEmailId());
        customer.setGender(customerRequest.getGender());


        Customer savedCustomer =  customerRepositary.save(customer);
        //Entity -> ResponseDTO
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(savedCustomer.getName());
        customerResponse.setAge(savedCustomer.getAge());
        customerResponse.setEmailId(savedCustomer.getEmailId());

        //Save the entity to DB
        return customerResponse;
    }

    public Customer getCustomer(int customerId) {
        Optional<Customer> getc =  customerRepositary.findById(customerId);
        if(getc.isEmpty()){
            throw new CustomerNotFoundException("Customer with id " + customerId + " not found");
        }
        return getc.get();
    }
}
