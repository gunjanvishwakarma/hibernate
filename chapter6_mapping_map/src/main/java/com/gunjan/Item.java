package com.gunjan;

import java.util.HashMap;
import java.util.Map;

public class Item {
    private Long id;
    private String name;
    private Map images = new HashMap();

    public Item() {
        super();
    }

    public Item(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map getImages() {
        return images;
    }

    public void setImages(Map images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", images=" + images + "]";
    }

}
