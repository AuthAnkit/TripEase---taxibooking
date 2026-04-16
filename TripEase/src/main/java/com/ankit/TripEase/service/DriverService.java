package com.ankit.TripEase.service;

import com.ankit.TripEase.Transformers.DriverTransformer;
import com.ankit.TripEase.dto.request.DriverRequest;
import com.ankit.TripEase.dto.response.DriverResponse;
import com.ankit.TripEase.exception.CustomerNotFoundException;
import com.ankit.TripEase.exception.DriverNotFoundException;
import com.ankit.TripEase.model.Driver;
import com.ankit.TripEase.repository.DriverRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;
    public DriverResponse addDriver(DriverRequest driverRequest) {
       Driver driver = DriverTransformer.DriverRequestToDriver(driverRequest);
        Driver savedDriver = driverRepository.save(driver);
       return DriverTransformer.DriverToDriverResponse(savedDriver);
    }


    public DriverResponse getDriver(int driverId) {
        Optional<Driver> getDriver = driverRepository.findById(driverId);
        if(getDriver.isEmpty()){
            throw new DriverNotFoundException("Driver not found");
        }
        Driver savedDriver = getDriver.get();
        return DriverTransformer.DriverToDriverResponse(savedDriver);
    }
}
