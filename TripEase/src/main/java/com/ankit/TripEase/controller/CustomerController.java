package com.ankit.TripEase.controller;


import com.ankit.TripEase.Enum.Gender;
import com.ankit.TripEase.dto.request.CustomerRequest;
import com.ankit.TripEase.dto.response.CustomerResponse;
import com.ankit.TripEase.model.Customer;
import com.ankit.TripEase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest  customerRequest) {
        return customerService.addCustomer(customerRequest);
    }

    @GetMapping("/get/customer-id/{id}")
    public CustomerResponse getCustomer(@PathVariable("id") int CustomerId) {

        return customerService.getCustomer(CustomerId);
    }

    @GetMapping("/get/gender/{gender}")
    public List<CustomerResponse> getCustomersByGender(@PathVariable("gender") Gender gender) {
        return customerService.getCustomersByGender(gender);
    }

    @GetMapping("/get")
    public List<CustomerResponse> getCustomersByGenderAndAge(@RequestParam Gender gender, @RequestParam int age) {
        return customerService.getCustomersByGenderAndAge(gender,age);
    }

    @GetMapping(" /get-by-genderAndAgeGreaterThan")
    public List<CustomerResponse> getCustomersByGenderAndAgeGreaterThan(@RequestParam Gender gender,
                                                                        @RequestParam int age) {
        return customerService.getCustomersByGenderAndAgeGreaterThan(gender,age);
    }
}
