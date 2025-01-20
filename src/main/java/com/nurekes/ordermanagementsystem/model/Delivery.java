package com.nurekes.ordermanagementsystem.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryID;

    @ManyToOne
    @JoinColumn(name = "orderid", referencedColumnName = "orderid")
    private OrderHeader orderHeader;
    private String type;
    private String status;
    private LocalDate departure;
    private LocalDate arrival;
}

