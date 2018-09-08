package com.gunjan;

import java.io.Serializable;

public class Bid implements Serializable {
    int price;
    private Long id;
    private Item item;

    public Bid() {
    }

    public Bid(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
