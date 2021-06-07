package com.tuananh.clothes_shop.repository;

import com.tuananh.clothes_shop.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderRepository extends JpaRepository<Orders, String>, JpaSpecificationExecutor<Orders> {

}