package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private String id;

    @Column(name = "OrderNumber", nullable = false)
    private String orderNumber;

    @Column(name = "AccountId", nullable = false)
    private String accountId;

    @Column(name = "Paid")
    private Date paid;

    @Column(name = "Total")
    private Integer total;

    @Column(name = "Details")
    private String details;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public Date getPaid() {
        return paid;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id + '\'' +
                "orderNumber=" + orderNumber + '\'' +
                "accountId=" + accountId + '\'' +
                "paid=" + paid + '\'' +
                "total=" + total + '\'' +
                "details=" + details + '\'' +
                '}';
    }
}
