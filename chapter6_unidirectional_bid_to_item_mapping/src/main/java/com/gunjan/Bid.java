package com.gunjan;

public class Bid {
    long id;
    int price;
    private Item item;

    public Bid() {
    }

    public Bid(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

}
