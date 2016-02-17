/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiestuff;

import byui.CIT260.zombieStuff.model.Equip;
import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
import byui.CIT260.zombieStuff.model.Inventory;
import byui.CIT260.zombieStuff.model.Location;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Player;
import byui.CIT260.zombieStuff.model.SceneAttack;
import byui.CIT260.zombieStuff.model.SceneHallway;
import byui.CIT260.zombieStuff.model.SceneShop;
import byui.CIT260.zombieStuff.view.StartProgramView;


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
        Equip playerOneEquip = new Equip();
        Map theMall = new Map();
        Location position = new Location();
        Game game = new Game();
        Player superPlayer = new Player();
        
        //display the banner
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        playerOne.setName("Josh");
        playerOne.setDescription("He is a holyer than thou type of person...");
        playerOne.setAttack(5);
        playerOne.setStrength(1);
        hammer.setIsWieldable(1);
        hammer.setItemDescription("It seems to be soft... Perhaps it's a toy.");
        hammer.setItemID(69);
        attackScene.setDescription("The zombie is closer to a mummy, with those reactions.");
        hallwayScene.setDescription("The hallway's vast, but the stores are enticing!");
        shopScene.setDescription("What pretty things!  Perhaps we should get home though.");
        playerOneInventory.setItemID(30);
        playerOneInventory.setSize(5);
        playerOneEquip.setObjectID(69);
        playerOneEquip.setAttributeDefence(0);
        playerOneEquip.setAttributeAttack(5);
        position.setDescription("You are at the mall");
        position.setName("The mall");
        position.setItemID(1);
        superPlayer.setDescription("You are the player. The super player.");
        superPlayer.setName("JNASTY");
                
                
        String playerInfo = playerOne.toString();
        String hammerInfo = hammer.toString();
        String attackInfo = attackScene.toString();
        String hallwaInfo = hallwayScene.toString();
        String shopScInfo = shopScene.toString();
        String plyInvInfo = playerOneInventory.toString();
        String plyEquInfo = playerOneEquip.toString();
        String positionInfo = position.toString();
        String superPlayerInfo = superPlayer.toString();
        System.out.println(playerInfo);
        System.out.println(hammerInfo);
        System.out.println(attackInfo);
        System.out.println(hallwaInfo);
        System.out.println(shopScInfo);
        System.out.println(plyInvInfo);
        System.out.println(plyEquInfo);
        System.out.println(positionInfo);
        System.out.println(superPlayerInfo);
        
         
    }
    
}
