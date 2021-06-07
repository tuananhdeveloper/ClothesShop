package com.tuananh.clothes_shop.dto;

import com.tuananh.clothes_shop.model.Product;

public class LineItemDto {
    private Product product;
    private int id;
    private int quantity;
    private int price;

    public LineItemDto(String productId, String productName, String productImage, int productPrice,
                       int id, int quantity, int price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.product = new Product(productId, productName, productImage, productPrice);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
