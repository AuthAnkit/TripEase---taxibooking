package com.ankit.TripEase.dto.request;


import com.ankit.TripEase.Enum.Gender;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DriverRequest {
    private String name;
    private  int age;
    private String emailId;
    private Gender gender;
}
