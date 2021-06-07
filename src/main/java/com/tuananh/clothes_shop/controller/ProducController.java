package com.tuananh.clothes_shop.controller;

import com.tuananh.clothes_shop.model.LineItem;
import com.tuananh.clothes_shop.model.Product;
import com.tuananh.clothes_shop.repository.LineItemRepository;
import com.tuananh.clothes_shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProducController {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private LineItemRepository lineItemRepository;

    @CrossOrigin
    @GetMapping("/products")
    public ResponseEntity<Object> getAll() {
        List<Product> productList = productRepository.findAll();
        return new ResponseEntity<Object>(productList, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/cart/{card_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addToCart(@RequestParam(name = "productId") String productId,
                                            @RequestParam(name = "price") int price,
                                            @PathVariable(name="card_id") int cardId) {

        List<LineItem> lineItemList = lineItemRepository.getLineItemNotOrdered(cardId, productId);

        //Kiểm tra xem sản phẩm đã tồn tại trong giỏ hàng chưa, nếu đã tồn tại thì cập nhật
        if(lineItemList.size() > 0) {
            lineItemList.get(0).setQuantity(lineItemList.get(0).getQuantity()+1);
            lineItemList.get(0).setPrice(lineItemList.get(0).getPrice()+ price);
            lineItemRepository.save(lineItemList.get(0));
            return new ResponseEntity<Object>(lineItemList.get(0), HttpStatus.OK);
        }

        LineItem lineItem = new LineItem();
        lineItem.setShoppingCartID(cardId);
        lineItem.setProductId(productId);
        lineItem.setQuantity(1);
        lineItem.setPrice(price);
        lineItemRepository.save(lineItem);
        return new ResponseEntity<Object>(lineItem, HttpStatus.OK);
    }
}
