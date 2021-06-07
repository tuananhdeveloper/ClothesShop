package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Number", nullable = false)
    private String number;

    @Column(name = "AccountId", nullable = false)
    private String accountId;

    @Column(name = "Ordered")
    private Date ordered;

    @Column(name = "Shipped")
    private Date shipped;

    @Column(name = "Ship_to")
    private Integer shipTo;

    @Column(name = "Status")
    private Integer status;

    @Column(name = "Total")
    private Integer total;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipTo(Integer shipTo) {
        this.shipTo = shipTo;
    }

    public Integer getShipTo() {
        return shipTo;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "number=" + number + '\'' +
                "accountId=" + accountId + '\'' +
                "ordered=" + ordered + '\'' +
                "shipped=" + shipped + '\'' +
                "shipTo=" + shipTo + '\'' +
                "status=" + status + '\'' +
                "total=" + total + '\'' +
                '}';
    }
}
