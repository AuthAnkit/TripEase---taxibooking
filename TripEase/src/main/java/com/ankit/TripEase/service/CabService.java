package com.ankit.TripEase.service;

import com.ankit.TripEase.Transformers.CabTransformer;
import com.ankit.TripEase.dto.request.CabRequest;
import com.ankit.TripEase.dto.response.CabResponse;
import com.ankit.TripEase.exception.DriverNotFoundException;
import com.ankit.TripEase.model.Cab;
import com.ankit.TripEase.model.Driver;
import com.ankit.TripEase.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

    @Service
    public class CabService {

        @Autowired
        DriverRepository driverRepository;

        public CabResponse registerCab(CabRequest cabRequest, int driverId) {
            Optional<Driver> optionalDriver = driverRepository.findById(driverId);
            if (optionalDriver.isEmpty()) {
                throw new DriverNotFoundException("Driver Not Found");
            }
            Driver driver = optionalDriver.get();
            Cab cab = CabTransformer.CabRequestToCab(cabRequest);
            driver.setCab(cab);
            Driver savedDriver = driverRepository.save(driver); //saving Both cab and driver in the database

            return CabTransformer.CabToCustomerResponse(savedDriver.getCab(),savedDriver);
        }
    }

