package com.ankit.TripEase.Transformers;
import com.ankit.TripEase.dto.request.DriverRequest;
import com.ankit.TripEase.dto.response.DriverResponse;
import com.ankit.TripEase.model.Driver;

public class DriverTransformer {

    public static Driver DriverRequestToDriver(DriverRequest driverRequest){
        Driver driver = Driver.builder()
                .age(driverRequest.getAge())
                .name(driverRequest.getName())
                .emailId(driverRequest.getEmailId())
                .gender(driverRequest.getGender()).build();
        return driver;
    }

    public static DriverResponse DriverToDriverResponse(Driver saveddriver){
        DriverResponse response = DriverResponse.builder()
                .name(saveddriver.getName())
                .age(saveddriver.getAge())
                .emailId(saveddriver.getEmailId()).build();
        return response;
    }
}
