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
public enum Item implements Serializable{
    Hammer("This is a pretty hard thing to see...", 1, 0, 2),
    Toothbrush("it's dirty", -1, 0, 0);
    
    private String itemDescription;
    private final int defenceBonus;
    private final int attackBonus;
    private final int weight;

    Item(String itemDescription, int attackBonus, int defenseBonus, int weight) {
        this.itemDescription = itemDescription;
        this.attackBonus = attackBonus;
        this.defenceBonus = defenseBonus;
        this.weight = weight;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}