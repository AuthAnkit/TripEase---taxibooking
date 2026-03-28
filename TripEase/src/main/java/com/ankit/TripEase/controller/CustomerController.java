package com.ankit.TripEase.controller;


import com.ankit.TripEase.model.Customer;
import com.ankit.TripEase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/get/customer-id/{id}")
    public Customer getCustomer(@PathVariable("id") int CustomerId) {
        return customerService.getCustomer(CustomerId);
    }
}
