package com.gunjan;

import java.util.ArrayList;
import java.util.Collection;

public class Item {
    private Long id;
    private String name;
    private Collection images = new ArrayList();

    // Why not List instead of Collection, any java geek will prefer below way
    // of declaring ArrayList.
    // But its not the case, here List will implies that Collection preserve the
    // order, but its actually not the case with bag, So please do not use the
    // below code.

    // private List images = new ArrayList();

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

    public Collection getImages() {
        return images;
    }

    public void setImages(Collection images) {
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
