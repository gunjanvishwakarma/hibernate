package com.gunjan;

import java.io.Serializable;
import java.util.Date;

public class CategorizedItem {
    private Id id = new Id();
    private String username;
    private Date dateAdded = new Date();
    private Item item;
    private Category category;
    public CategorizedItem() {

    }

    public CategorizedItem(String username, Item item, Category category) {
        super();
        this.username = username;
        this.item = item;
        this.category = category;
        this.id.categoryId = category.getId();
        this.id.itemId = item.getId();

    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
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

    public static class Id implements Serializable {
        private Long categoryId;
        private Long itemId;

        public Id() {

        }

        public Id(Long categoryId, Long itemId) {
            super();
            this.categoryId = categoryId;
            this.itemId = itemId;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result
                    + ((categoryId == null) ? 0 : categoryId.hashCode());
            result = prime * result
                    + ((itemId == null) ? 0 : itemId.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Id other = (Id) obj;
            if (categoryId == null) {
                if (other.categoryId != null)
                    return false;
            } else if (!categoryId.equals(other.categoryId))
                return false;
            if (itemId == null) {
                if (other.itemId != null)
                    return false;
            } else if (!itemId.equals(other.itemId))
                return false;
            return true;
        }
    }


}
