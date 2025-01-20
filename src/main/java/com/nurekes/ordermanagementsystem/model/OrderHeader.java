package com.nurekes.ordermanagementsystem.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class OrderHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    private LocalDate orderDate;
    @ManyToOne
    @JoinColumn(name = "customerid", referencedColumnName = "customerid")
    private Customer customer;
}

