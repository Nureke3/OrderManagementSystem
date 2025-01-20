package com.nurekes.ordermanagementsystem.repository;

import com.nurekes.ordermanagementsystem.model.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "order_headers", path = "order-headers")
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}