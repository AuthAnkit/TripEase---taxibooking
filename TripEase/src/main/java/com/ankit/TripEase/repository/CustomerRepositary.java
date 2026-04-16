package com.ankit.TripEase.repository;

import com.ankit.TripEase.Enum.Gender;
import com.ankit.TripEase.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

    List<Customer> findByGender(Gender gender);

    List<Customer> findByGenderAndAge(Gender gender, int age);

    @Query("select c from Customer c where c.gender = :gender and c.age > :age")
    List<Customer> findByGenderAndAgeGreaterThan(@Param("gender") Gender gender,
                                                 @Param("age") int age);
}
