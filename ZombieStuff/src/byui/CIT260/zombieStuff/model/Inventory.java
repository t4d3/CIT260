/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

/**
 *
 * @author T4d3-T550
 */
public class Inventory {
    private int size;
    private int itemID;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.size;
        hash = 53 * hash + this.itemID;
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
        final Inventory other = (Inventory) obj;
        if (this.size != other.size) {
            return false;
        }
        return this.itemID == other.itemID;
    }

    public Inventory() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    
}
