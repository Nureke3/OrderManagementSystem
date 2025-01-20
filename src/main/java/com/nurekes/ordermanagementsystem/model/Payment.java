package com.nurekes.ordermanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentID;
    private LocalDate pDate;
    private String type;
    @ManyToOne
    @JoinColumn(name = "orderid", referencedColumnName = "orderid")
    private OrderHeader orderHeader;
    @ManyToOne
    @JoinColumn(name = "customerid", referencedColumnName = "customerid")
    private Customer customer;
    private BigDecimal total;
}

