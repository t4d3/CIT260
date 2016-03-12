/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author T4d3-T550
 */
public class GameMenuView extends View{
    public GameMenuView() {
            super("***********************Game menu***********************"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n* G - Go to a store                                   *"
+ "\n* M - Display the Map                                 *"
+ "\n* F - Fight a Zombie                                  *"
+ "\n* I - Look at your Inventory                          *"
+ "\n* Q - Quit                                            *"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n*******************************************************"
+ "\n\tWhat would you like to do? ");
    }

    @
        Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M" :
                    this.MapView();
                    break;
            case "U":
                    this.movePlayer();
                    break;
            case "F":
                    this.FightZombieView();
                    break;
            case "I":
                    this.InventoryView();
                    break;
            case "B":
                    this.FightZombieView();
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void MapView() {
        MapView mapView = new MapView();
        mapView.display();
    }

    private void movePlayer() {
        System.out.println("*** movePlayer() ***");
    }
    
    private void FoodMenuView() {
        FoodMenuView foodMenuView = new FoodMenuView();
        foodMenuView.display();
    }

    private void InventoryView() {
//Psuedo code for giving GameCharacter.Player some Item
        GameCharacter.Player.addInventoryItem(Item.Hammer);
        GameCharacter.Player.addInventoryItem(Item.Toothbrush);
//Hopefully this will be in the InventoryView class, in the Super() call.
        String inventoryDisplayBlock = 
                "***********************Inventory***********************"
            + "\n*                                                     *";
        ArrayList<Item> inventory = GameCharacter.Player.getInventory();
        for (int i = 0; i < 4; i++) {
            String currentItem = "\t\t";
            if (i < inventory.size())
                currentItem = inventory.get(i).getItemName();
            inventoryDisplayBlock += ("\n* " + (i + 1) + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
        System.out.print(inventoryDisplayBlock);

        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void FightZombieView() {
        FightZombieView fightZombieView = new FightZombieView();
        fightZombieView.display();
    }

}
