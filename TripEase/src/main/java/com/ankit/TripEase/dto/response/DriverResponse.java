package com.ankit.TripEase.dto.response;

import com.ankit.TripEase.Enum.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class DriverResponse {
    private String name;
    private  int age;
    private String emailId;
}
