package com.gunjan;

public abstract class BillingDetails {


    private Long id;

    private String owner;

    public BillingDetails() {

    }

    public BillingDetails(String owner) {
        super();
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
