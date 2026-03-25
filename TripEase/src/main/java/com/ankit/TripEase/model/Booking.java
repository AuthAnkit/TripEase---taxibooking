package com.ankit.TripEase.model;


import com.ankit.TripEase.Enum.status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Booking {
    @Id
    private int bookingID;
    private String pickUp;
    private String destination;
    private double tripInKm;
    private status tripStatus;
    private  double billAmount;

    @CreationTimestamp
    private Date bookedAt;

    @UpdateTimestamp
    private Date lastupdatedAt;


}
