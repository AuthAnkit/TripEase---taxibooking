package com.ankit.TripEase.dto.response;

import com.ankit.TripEase.Enum.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse {
    private String name;
    private  int age;
    private String emailId;
}
