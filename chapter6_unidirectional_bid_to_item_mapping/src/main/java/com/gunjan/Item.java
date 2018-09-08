package com.gunjan;


/**
 * @author Gunja
 */
public class Item {

    long id;
    String name = null;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
