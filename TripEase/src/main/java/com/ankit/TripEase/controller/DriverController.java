package com.ankit.TripEase.controller;

import com.ankit.TripEase.dto.request.DriverRequest;
import com.ankit.TripEase.dto.response.CustomerResponse;
import com.ankit.TripEase.dto.response.DriverResponse;
import com.ankit.TripEase.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController{

    @Autowired
    private DriverService driverService;

    @PostMapping("/addDriver")
    public DriverResponse addDriver(@RequestBody DriverRequest driverRequest){
        return driverService.addDriver(driverRequest);
    }

    @GetMapping("/getDriver/{driverId}")
    public DriverResponse getDriver(@PathVariable int driverId){
        return driverService.getDriver(driverId);
    }
}
