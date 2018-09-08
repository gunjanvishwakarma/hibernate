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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
