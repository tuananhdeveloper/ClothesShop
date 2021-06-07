package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private String id;

    @Column(name = "UserLogin_id")
    private String userloginId;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUserloginId(String userloginId) {
        this.userloginId = userloginId;
    }

    public String getUserloginId() {
        return userloginId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id + '\'' +
                "userloginId=" + userloginId + '\'' +
                "address=" + address + '\'' +
                "phone=" + phone + '\'' +
                "email=" + email + '\'' +
                '}';
    }
}
