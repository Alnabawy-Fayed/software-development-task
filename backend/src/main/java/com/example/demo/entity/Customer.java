package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "customer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String address;

    public Customer(String fullName, String email, Date dateOfBirth, String address) {
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
}
