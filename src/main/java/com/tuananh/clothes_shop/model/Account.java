package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id", nullable = false)
    private String id;

    @Column(name = "CustomerId", nullable = false)
    private String customerId;

    @Column(name = "Billing_address")
    private String billingAddress;

    @Column(name = "Is_closed", nullable = false)
    private Boolean closed;

    @Column(name = "OpenDate")
    private Date openDate;

    @Column(name = "ClosedDate")
    private Date closedDate;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean isClosed() {
        return closed;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id + '\'' +
                "customerId=" + customerId + '\'' +
                "billingAddress=" + billingAddress + '\'' +
                "closed=" + closed + '\'' +
                "openDate=" + openDate + '\'' +
                "closedDate=" + closedDate + '\'' +
                '}';
    }
}
