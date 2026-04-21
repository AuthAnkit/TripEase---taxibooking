package com.ankit.TripEase.model;

import com.ankit.TripEase.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverID;

    @Column(name ="name")
    private String name;
    private  int age;

    @Column(unique = true , nullable = false)
    private String emailId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name = "driver_id")
    List<Booking> bookings = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cab_id")
    Cab cab;
}