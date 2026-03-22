package com.ankit.TripEase;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Cab {
    @Id
    private int cabId;
    private String cabNumber;
    private String cabModel;
    private double perKmRate;
    private boolean available;
}
