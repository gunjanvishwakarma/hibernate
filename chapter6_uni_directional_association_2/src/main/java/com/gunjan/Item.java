package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class Item {

    Set bids = new HashSet();
    private int id;
    private String name;

    Item() {
    }

    public Item(String text) {
        this.name = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getBids() {
        return bids;
    }

    public void setBids(Set bids) {
        this.bids = bids;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }

}
