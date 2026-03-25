package com.ankit.TripEase.model;

import com.ankit.TripEase.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Driver {
    @Id
    private int driverID;

    @Column(name ="name")
    private String name;
    private  int age;
    private String emailId;
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name = "driver_id")
    ArrayList<Booking> bookings = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cab_id")
    Cab cab;
}