package com.gunjan;

public class Item {

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

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }

}
