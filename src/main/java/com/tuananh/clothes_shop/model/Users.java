package com.tuananh.clothes_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Login_id", nullable = false)
    private String loginId;

    @Column(name = "Password")
    private String password;

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "loginId=" + loginId + '\'' +
                "password=" + password + '\'' +
                '}';
    }
}
