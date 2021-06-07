package com.tuananh.clothes_shop.controller;

import com.tuananh.clothes_shop.model.LineItem;
import com.tuananh.clothes_shop.repository.LineItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LineItemController {

    @Autowired
    private LineItemRepository lineItemRepository;

    @CrossOrigin
    @PatchMapping(value = "lineItem/{lineItem_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LineItem> updateLineItem(
            @PathVariable("lineItem_id") int lineItemId,
            @RequestBody LineItem lineItem
            ) {

        LineItem oldLineItem = lineItemRepository.getById(lineItemId);

        if(lineItem.getOrderNumber() != null) oldLineItem.setOrderNumber(lineItem.getOrderNumber());
        if(lineItem.getPrice() != null) oldLineItem.setPrice(lineItem.getPrice());
        if(lineItem.getQuantity() != null) oldLineItem.setQuantity(lineItem.getQuantity());

        lineItemRepository.save(oldLineItem);
        return new ResponseEntity<>(oldLineItem, HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "lineItem/{lineItem_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> deleteLineItem(
            @PathVariable("lineItem_id") int lineItemId
    ) {

        lineItemRepository.deleteLineItem(lineItemId);
        return new ResponseEntity<Long>(lineItemRepository.count(), HttpStatus.OK);
    }

}
