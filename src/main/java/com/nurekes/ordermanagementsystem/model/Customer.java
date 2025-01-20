package com.nurekes.ordermanagementsystem.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerID;
    private String fname;
    private String lname;
    private String address;
    private String phone;
    private String email;
}

