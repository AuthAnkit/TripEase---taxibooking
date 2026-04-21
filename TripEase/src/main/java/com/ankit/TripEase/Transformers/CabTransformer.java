package com.ankit.TripEase.Transformers;

import com.ankit.TripEase.dto.request.CabRequest;
import com.ankit.TripEase.dto.request.CustomerRequest;
import com.ankit.TripEase.dto.response.CabResponse;
import com.ankit.TripEase.dto.response.CustomerResponse;
import com.ankit.TripEase.model.Cab;
import com.ankit.TripEase.model.Driver;

public class CabTransformer {

    public static Cab CabRequestToCab(CabRequest cabRequest) {
        Cab cabResponse = Cab.builder().cabNumber(cabRequest.getCabNumber())
                .cabModel(cabRequest.getCabModel())
                .cabNumber(cabRequest.getCabNumber())
                .perKmRate(cabRequest.getPerKmRate())
                .available(true)
                .build();
        return cabResponse;
    }

    public  static CabResponse CabToCustomerResponse(Cab cab , Driver driver) {
        CabResponse cabResponse = CabResponse.builder().cabNumber(cab.getCabNumber())
                .cabModel(cab.getCabModel())
                .cabNumber(cab.getCabNumber())
                .available(cab.isAvailable())
                .perKmRate(cab.getPerKmRate())
                .driver(DriverTransformer.DriverToDriverResponse(driver))
                .build();
        return cabResponse;
    }
}

