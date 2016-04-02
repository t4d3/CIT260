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
public enum Item implements Serializable{

//Story related objects
    Dress      (0,0,1, "Princess dress", "Too small to wear, but it'll be great!"),
    Shoes      (0,0,1, "Princess shoes", "Too small to wear, but it'll be great!"),
    Tiara      (0,0,1, "Princess tiara", "Too small to wear, but it'll be great!"),

//Attack related object
    Hammer     (2, 0, 2, "Hammer\t", "This is a pretty hard thing, but you can manage."), 
    Toothbrush (-1, 0, 0, "Toothbrush", "It's got lots of dust, and a black hair... Gross."),
    Sword      (5, 0, 1, "Sword\t", "I guess you could stab something with it..."),

//Defence related objects
    Shirt      (0, 1, 1, "Shirt\t", "The Hello Kitty picture is so CUTE!!!"),
    Armor      (0, 5, 5, "Full Body Armor", "In theory, this should protect me."),
    Helmet     (0, 5, 2, "Steel helmet", "It doesn't even block my vision!"),

//not really related objects
    Toothpick  (1,0,0, "Toothpick", "I have no IDEA why you'd want that! It's used."),
    Game       (1,0,0, "Halo 4", "This is an old game now.  Great gome, lame story line."),
    PhoneCase  (-1,0,0, "Phone case", "It doesn't fit your phone, and it looks kina broken");

//out of lazyness, if itemName length < "Hammer", add two \t for the spacing

    private final String itemDescription;
    private final String itemName;
    private final int defenceBonus;
    private final int attackBonus;
    private final int weight;

    Item(int attackBonus, int defenseBonus, int weight, String itemName, String itemDescription) {
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.attackBonus = attackBonus;
        this.defenceBonus = defenseBonus;
        this.weight = weight;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getWeight() {
        return weight;
    }
}