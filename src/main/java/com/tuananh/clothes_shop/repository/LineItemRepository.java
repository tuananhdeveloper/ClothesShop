package com.tuananh.clothes_shop.repository;

import com.tuananh.clothes_shop.dto.LineItemDto;
import com.tuananh.clothes_shop.model.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface LineItemRepository extends JpaRepository<LineItem, Integer>, JpaSpecificationExecutor<LineItem> {
    @Query("SELECT new com.tuananh.clothes_shop.dto.LineItemDto(P.id, P.name, P.image, P.price, L.ID, L.quantity, L.price)" +
            "FROM LineItem L INNER JOIN Product P ON L.productId = P.id\n" +
            "WHERE L.shoppingCartID = ?1 AND L.orderNumber is NULL")
    List<LineItemDto> getLineItemNotOrdered(int cartId);

    @Query("From LineItem L WHERE L.shoppingCartID = ?1 AND L.productId = ?2 AND L.orderNumber is NULL ")
    List<LineItem> getLineItemNotOrdered(int cartId, String productId);

    @Query("FROM LineItem WHERE shoppingCartID = ?1 AND orderNumber IS NOT NULL")
    List<LineItem> getLineItemOrdered(int cartId);

    @Transactional
    @Modifying
    @Query("DELETE FROM LineItem WHERE ID = ?1 AND orderNumber is null")
    void deleteLineItem(int lineItemId);
}