package com.tuananh.clothes_shop.controller;

import com.tuananh.clothes_shop.common.Status;
import com.tuananh.clothes_shop.dto.LineItemDto;
import com.tuananh.clothes_shop.repository.LineItemRepository;
import com.tuananh.clothes_shop.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class CartController {
    @Autowired
    LineItemRepository lineItemRepository;

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @CrossOrigin
    @GetMapping(value = "cart/{cartId}")
    public ResponseEntity<Object> getCart(@PathVariable(name="cartId") int cartId) {
        List<LineItemDto> lineItemList = lineItemRepository.getLineItemNotOrdered(cartId);
        return new ResponseEntity<Object>(lineItemList, HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "cart/{cartId}")
    public ResponseEntity<Object> emptyCart(@PathVariable(name="cartId") int cartId) {
        shoppingCartRepository.emptyCart(cartId);
        return new ResponseEntity<Object>(Status.SUCCESS, HttpStatus.OK);
    }
}
