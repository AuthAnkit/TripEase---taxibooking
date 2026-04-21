package com.ankit.TripEase.controller;

import com.ankit.TripEase.dto.request.CabRequest;
import com.ankit.TripEase.dto.response.CabResponse;
import com.ankit.TripEase.model.Cab;
import com.ankit.TripEase.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")


public class CabController {
    @Autowired
    CabService cabService;

    @PostMapping("/register/driver/{driver_id}")
    public CabResponse registerCab(@RequestBody CabRequest cabRequest,
                                   @PathVariable("driver_id") int driver_id){
        return cabService.registerCab(cabRequest,driver_id);
    }



}

