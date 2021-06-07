package com.tuananh.clothes_shop.dto;

public class UserInfoDto {
    private String loginId;
    private String accountId;
    private int cartId;
    private String phone;

    public UserInfoDto(String loginId, String accountId, int cartId, String phone) {
        this.loginId = loginId;
        this.accountId = accountId;
        this.cartId = cartId;
        this.phone = phone;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

