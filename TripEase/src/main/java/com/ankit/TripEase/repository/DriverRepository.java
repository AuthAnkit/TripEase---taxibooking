package com.ankit.TripEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankit.TripEase.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {

}
