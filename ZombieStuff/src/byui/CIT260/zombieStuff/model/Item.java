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
    Hammer("This is a pretty hard thing, but you can manage.", 1, 0, 2),
    Toothbrush("It's got lots of dust, and a black hair... Gross.", -1, 0, 0);
    
    private final String itemDescription;
    private final int defenceBonus;
    private final int attackBonus;
    private final int weight;

    Item(String itemDescription, int attackBonus, int defenseBonus, int weight) {
        this.itemDescription = itemDescription;
        this.attackBonus = attackBonus;
        this.defenceBonus = defenseBonus;
        this.weight = weight;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getWeight() {
        return weight;
    }
}