package com.tuananh.clothes_shop.repository;

import com.tuananh.clothes_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
//    @Query("INSERT INTO LineItem(OrderNumber, ProductId) VALUE(?1, ?2, ?)")
}