package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class Category {

    Long id;
    String name;
    Set<Item> items = new HashSet<Item>();
    private Set<CategorizedItem> categorizedItems = new HashSet<CategorizedItem>();

    public Category(String name) {
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

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<CategorizedItem> getCategorizedItems() {
        return categorizedItems;
    }

    public void setCategorizedItems(Set<CategorizedItem> categorizedItems) {
        this.categorizedItems = categorizedItems;
    }

}
