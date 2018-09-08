package com.gunjan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Item implements Serializable {
    private Long id;
    private String name;
    private Collection bids = new ArrayList();

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

    public Collection getBids() {
        return bids;
    }

    public void setBids(Collection bids) {
        this.bids = bids;
    }

}
