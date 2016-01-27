/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff;

import java.io.Serializable;

/**
 *
 * @author T4d3-T550
 */
public class Item implements Serializable{
    private String itemDescription;

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
    private int isWieldable;

}