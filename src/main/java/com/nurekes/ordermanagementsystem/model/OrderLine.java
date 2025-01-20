package com.nurekes.ordermanagementsystem.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderLineID;
    @ManyToOne
    @JoinColumn(name = "orderid", referencedColumnName = "orderid")
    private OrderHeader orderHeader;
    @ManyToOne
    @JoinColumn(name = "productid", referencedColumnName = "productid")
    private Product product;
    private int quantity;
}

