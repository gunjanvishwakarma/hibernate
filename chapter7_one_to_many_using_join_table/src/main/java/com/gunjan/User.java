package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class User {
    Long id;
    String name;
    Set<Item> boughtItems = new HashSet<Item>();

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

    public Set<Item> getBoughtItems() {
        return boughtItems;
    }

    public void setBoughtItems(Set<Item> boughtItems) {
        this.boughtItems = boughtItems;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", items=" + boughtItems
                + "]";
    }
}
