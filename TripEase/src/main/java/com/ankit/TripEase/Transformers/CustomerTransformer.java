package com.ankit.TripEase.Transformers;

import com.ankit.TripEase.dto.request.CustomerRequest;
import com.ankit.TripEase.dto.response.CustomerResponse;
import com.ankit.TripEase.model.Customer;

public class CustomerTransformer {
    public static Customer CustomerRequestToCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder().age(customerRequest.getAge())
                .name(customerRequest.getName())
                .emailId(customerRequest
                .getEmailId())
                .build();
        return customer;
    }

    public static CustomerResponse CustomerToCustomerResponse(Customer savedCustomer) {
        CustomerResponse customerResponse = CustomerResponse.builder().age(savedCustomer.getAge())
                .name(savedCustomer.getName())
                .emailId(savedCustomer.getEmailId())
                .build();
        return customerResponse;
    }
}
