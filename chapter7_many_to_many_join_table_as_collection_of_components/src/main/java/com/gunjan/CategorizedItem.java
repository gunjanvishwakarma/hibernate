package com.gunjan;

import java.util.Date;

public class CategorizedItem {

    private String username;
    private Date dateAdded = new Date();
    private Item item;
    private Category category;

    public CategorizedItem() {

    }

    public CategorizedItem(String username, Item item, Category category) {
        this.username = username;
        this.item = item;
        this.category = category;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
