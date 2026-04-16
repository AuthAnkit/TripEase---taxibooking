package com.ankit.TripEase.service;

import com.ankit.TripEase.Enum.Gender;
import com.ankit.TripEase.Transformers.CustomerTransformer;
import com.ankit.TripEase.dto.request.CustomerRequest;
import com.ankit.TripEase.dto.response.CustomerResponse;
import com.ankit.TripEase.exception.CustomerNotFoundException;
import com.ankit.TripEase.model.Customer;
import com.ankit.TripEase.repository.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepositary customerRepositary;



    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        //RequestDTO -> Entity
        Customer customer =CustomerTransformer.CustomerRequestToCustomer( customerRequest );

        Customer savedCustomer =  customerRepositary.save(customer);

        //Entity -> ResponseDTO
        return CustomerTransformer.CustomerToCustomerResponse(customer);
    }



    public CustomerResponse getCustomer(int customerId) {

        Optional<Customer> getCustomer =  customerRepositary.findById(customerId);
        if(getCustomer.isEmpty()){
            throw new CustomerNotFoundException("Customer with id " + customerId + " not found");
        }
        Customer savedCustomer = getCustomer.get();
        return CustomerTransformer.CustomerToCustomerResponse(savedCustomer);
    }


    public List<CustomerResponse> getCustomersByGender(Gender gender) {
        List<Customer> customers = customerRepositary.findByGender(gender);
        List<CustomerResponse> customerResponseList = new ArrayList<>();
        for(Customer customer : customers){
            customerResponseList.add(CustomerTransformer.CustomerToCustomerResponse(customer));
        }
        return customerResponseList;
    }

    public List<CustomerResponse> getCustomersByGenderAndAge(Gender gender, int age) {
        List<Customer> customers = customerRepositary.findByGenderAndAge(gender,age);
        List<CustomerResponse> customerResponseList = new ArrayList<>();
        for(Customer customer : customers){
            customerResponseList.add(CustomerTransformer.CustomerToCustomerResponse(customer));
        }
        return customerResponseList;
    }

    public List<CustomerResponse> getCustomersByGenderAndAgeGreaterThan(Gender gender, int age) {
        List<Customer> customers = customerRepositary.findByGenderAndAgeGreaterThan(gender,age);
        List<CustomerResponse> customerResponseList = new ArrayList<>();
        for(Customer customer : customers){
            customerResponseList.add(CustomerTransformer.CustomerToCustomerResponse(customer));
        }
        return customerResponseList;
    }
}
