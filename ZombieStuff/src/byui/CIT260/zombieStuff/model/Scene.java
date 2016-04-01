/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import java.io.Serializable;

/**
 *
 * @author T4d3-T550
 */
public enum Scene implements Serializable {

    Aldo("Aldo", ""),
    BestBuy("Best Buy", ""),
    Claires("Claire's", ""),
    Dickies("Dickies", ""),
    // E - E("", ""),
    FoodCourt("Food Court", ""),
    GameStop("GameStop", ""),
    Hall("Hallway", ""),
    InkShop("Ink Shop", ""),
    JCPenney("JCPenney", ""),
    Kay("Kay Jewelers", ""),
    Lids("Lids", ""),
    Maurices("Maurices", ""),
    Nike("Nike", ""),
    OldNavy("Old Navy", ""),
    Pink("Pink", ""),
    // Q - Quit
    Rue("Rue 21", ""),
    Stairs("Stairs", ""), //the big stores can be cover 2 locations, with two floors
    Outside("Outside", "How in the **** did you get here?"),
    Target("Target", ""),
    Uber("Uber", ""),
    VictoriasSecret("Victoria's Secret", ""),
    //    Wag("Wag", ""),
    //    Xuppa("Xuppa", ""),
    //    YMCA("YMCA", ""),
    Zumies("Zumies", "A great place...for teeangers.");

    private final String description;
    private final String name;

    Scene(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
}
