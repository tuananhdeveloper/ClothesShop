package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private String id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Supplier")
    private Integer supplier;

    @Column(name = "Image")
    private String image;

    @Column(name = "Price")
    private int price;

    public Product(String id, String name, String image, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public Product() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Integer getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "supplier=" + supplier + '\'' +
                '}';
    }
}
