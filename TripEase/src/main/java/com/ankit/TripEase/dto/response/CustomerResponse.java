package com.ankit.TripEase.dto.response;

import com.ankit.TripEase.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerResponse {
    private String name;
    private  int age;
    private String emailId;
}
