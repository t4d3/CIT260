/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author T4d3-T550
 */
public class Item implements Serializable{
    private String itemDescription;
    private int isWieldable;

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" + "itemDescription=" + itemDescription + ", isWieldable=" + isWieldable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.itemDescription);
        hash = 19 * hash + this.isWieldable;
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
        final Item other = (Item) obj;
        if (this.isWieldable != other.isWieldable) {
            return false;
        }
        return Objects.equals(this.itemDescription, other.itemDescription);
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getIsWieldable() {
        return isWieldable;
    }

    public void setIsWieldable(int isWieldable) {
        this.isWieldable = isWieldable;
    }
}