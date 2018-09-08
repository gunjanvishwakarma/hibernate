package com.gunjan;


public class Bid {
    private Long id;
    private int price;

    public Bid() {
    }

    public Bid(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bid [id=" + id + ", price=" + price + "]";
    }


}
