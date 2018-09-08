package com.gunjan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Item implements Serializable {

    String name;
    private Long id;
    private List bids = new ArrayList();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getBids() {
        return bids;
    }

    public void setBids(List bids) {
        this.bids = bids;
    }

}
