package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Long id;
    private String name;
    private Set<Image> images = new HashSet<Image>();

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

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

}
