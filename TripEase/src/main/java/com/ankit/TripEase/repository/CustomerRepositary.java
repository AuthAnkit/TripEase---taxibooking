package com.ankit.TripEase.repository;

import com.ankit.TripEase.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

}
