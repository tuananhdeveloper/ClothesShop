package com.tuananh.clothes_shop.repository;

import com.tuananh.clothes_shop.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, String>, JpaSpecificationExecutor<ShoppingCart> {
    @Transactional
    @Modifying
    @Query("DELETE FROM LineItem WHERE shoppingCartID = ?1 AND orderNumber IS NULL")
    void emptyCart(int cartId);
}