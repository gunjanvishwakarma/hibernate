package com.gunjan;

import java.util.HashSet;
import java.util.Set;

public class Category {

    private Long id = null;
    private String name;
    private Category parentCategory;
    private Set childCategories = new HashSet();

    Category() {
    }

    public Category(String name, Category parentCategory, Set childCategories,
                    Set categorizedItems) {
        this.name = name;
        this.parentCategory = parentCategory;
        this.childCategories = childCategories;
    }

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

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set childCategories) {
        this.childCategories = childCategories;
    }

    public void addChildCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException(
                    "Can't add a null Category as child.");
        // Remove from old parent category
        if (category.getParentCategory() != null)
            category.getParentCategory().getChildCategories().remove(category);
        // Set parent in child
        category.setParentCategory(this);
        // Set child in parent
        this.getChildCategories().add(category);
    }

    public String toString() {
        return "Category ('" + getId() + "'), " + "Name: '" + getName() + "'";
    }

}
