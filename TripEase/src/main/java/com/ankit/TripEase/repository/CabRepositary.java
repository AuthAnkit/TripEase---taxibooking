package com.ankit.TripEase.repository;

import com.ankit.TripEase.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepositary extends JpaRepository<Cab, Integer> {

}
