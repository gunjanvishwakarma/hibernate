package com.gunjan;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private Long id;
    private String name;
    private List images = new ArrayList();

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

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
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
