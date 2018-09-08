package com.gunjan;

public class User {
    private Long id;
    private String userName;
    private Address shippingAddress;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
