package com.nurekes.ordermanagementsystem.repository;

import com.nurekes.ordermanagementsystem.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
