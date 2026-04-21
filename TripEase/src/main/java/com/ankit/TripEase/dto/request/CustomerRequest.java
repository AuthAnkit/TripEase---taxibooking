package com.ankit.TripEase.dto.request;

import com.ankit.TripEase.Enum.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerRequest {
    private String name;
    private  int age;
    private String emailId;
    private Gender gender;
}
