/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.io.Serializable;

/**
 *
 * @author T4d3-T550
 */
public class Object implements Serializable{
    private String itemDescription;
    private int isWieldable;

    public Object() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.isWieldable;
        return hash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Object other = (Object) obj;
        return this.isWieldable == other.isWieldable;
    }

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
        final Object other = (Object) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Object{" + "itemDescription=" + itemDescription + ", isWieldable=" + isWieldable + '}';
    }
        
    
    public String getObjectDescription() {
        return itemDescription;
    }

    public void setObjectDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getIsWieldable() {
        return isWieldable;
    }

    public void setIsWieldable(int isWieldable) {
        this.isWieldable = isWieldable;
    }

}