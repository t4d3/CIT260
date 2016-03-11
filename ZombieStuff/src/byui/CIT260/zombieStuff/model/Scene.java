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
public enum Scene implements Serializable {
        
    Zumies("A great place...for teeangers."),
    OldNavy(""),
    Zales("Too fancy for your bood."),
    Nike(""),
    VictoriasSecret(""),
    Stairs(""),
    Claires(""),
    Target("");

    private final String itemDescription;
    
    Scene(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}