package com.tuananh.clothes_shop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LineItem")
public class LineItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "OrderNumber")
    private String orderNumber;

    @Column(name = "ProductId", nullable = false)
    private String productId;

    @Column(name = "ShoppingCartID", nullable = false)
    private Integer shoppingCartID;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Price")
    private Integer price;

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setShoppingCartID(Integer shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public Integer getShoppingCartID() {
        return shoppingCartID;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "ID=" + ID + '\'' +
                "orderNumber=" + orderNumber + '\'' +
                "productId=" + productId + '\'' +
                "shoppingCartID=" + shoppingCartID + '\'' +
                "quantity=" + quantity + '\'' +
                "price=" + price + '\'' +
                '}';
    }
}
