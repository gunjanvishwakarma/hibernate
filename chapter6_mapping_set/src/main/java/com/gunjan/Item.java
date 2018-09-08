package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Long id;
    private String name;
    private Set<String> images = new HashSet<String>();

    public Item() {
        super();
    }

    public Item(String name) {
        super();
        this.name = name;
    }

    public Set<String> getImages() {
        return images;
    }

    public void setImages(Set<String> images) {
        this.images = images;
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

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", images=" + images + "]";
    }

}
