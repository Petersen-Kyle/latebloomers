/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lafon
 */
public class StoreHouse implements Serializable {

    private Author author;
    private Item inventoryItem;

    public StoreHouse() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Item getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Item inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.author);
        hash = 59 * hash + Objects.hashCode(this.inventoryItem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoreHouse other = (StoreHouse) obj;
        if (this.author != other.author) {
            return false;
        }
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreHouse{" + "author=" + author + ", inventoryItem=" + inventoryItem + '}';
    }

}
