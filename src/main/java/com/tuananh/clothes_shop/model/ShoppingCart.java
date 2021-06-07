package com.tuananh.clothes_shop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "AccountId", nullable = false)
    private String accountId;

    @Column(name = "UserLogin_id", nullable = false)
    private String userloginId;

    @Column(name = "Created")
    private Date created;

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setUserloginId(String userloginId) {
        this.userloginId = userloginId;
    }

    public String getUserloginId() {
        return userloginId;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "ID=" + ID + '\'' +
                "accountId=" + accountId + '\'' +
                "userloginId=" + userloginId + '\'' +
                "created=" + created + '\'' +
                '}';
    }
}
