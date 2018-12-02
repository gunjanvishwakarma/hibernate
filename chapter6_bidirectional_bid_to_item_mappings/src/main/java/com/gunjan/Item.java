package com.gunjan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Gunja
 */
public class Item implements Serializable {
    String name;
    private Long id;
    private Collection bids = new ArrayList();
    //private Set bids = new HashSet();

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
