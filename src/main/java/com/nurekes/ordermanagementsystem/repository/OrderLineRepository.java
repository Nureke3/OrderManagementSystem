package com.nurekes.ordermanagementsystem.repository;

import com.nurekes.ordermanagementsystem.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "order_lines", path = "order-lines")
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
