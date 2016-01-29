/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiestuff;

import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
import byui.CIT260.zombieStuff.model.Inventory;
import byui.CIT260.zombieStuff.model.SceneAttack;
import byui.CIT260.zombieStuff.model.SceneHallway;
import byui.CIT260.zombieStuff.model.SceneShop;

/**
 *
 * @author T4d3-T550
 */
public class ZombieStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameCharacter playerOne = new GameCharacter();
        Item hammer = new Item();
        SceneAttack attackScene = new SceneAttack();
        SceneHallway hallwayScene = new SceneHallway();
        SceneShop shopScene = new SceneShop();
        Inventory playerOneInventory = new Inventory();
        
        playerOne.setName("Josh");
        playerOne.setDescription("He is a holyer than thou type of person...");
        playerOne.setAttack(5);
        playerOne.setStrength(1);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
