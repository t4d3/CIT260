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
 * @author T4d3-T5500
 */
public class InventoryView extends View {

    public InventoryView() {
        super("");
        this.displayMessage = getInventoryBlockMessage();
    }
    
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "D" :
                this.dropItem();
                break;
            case "E" :
                this.equipItem();
                break;
            case "S" :
                this.viewInventoryStats();
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void dropItem() {
        this.displayMessage = ("Which item do you want to drop? ERROR CHECKING NOT IMPLIMENTED: ");
        int num = Integer.valueOf(this.getInput());
        System.out.println(num);
        

//this resets the super message, because they are in the inventoryView() function.
        this.displayMessage = getInventoryBlockMessage();
    }

    private void equipItem() {
        System.out.println("**Equip item called***");
    }

    
    private String viewInventoryStats() {
                this.displayMessage = 
                  "*****************Inventory Stats***********************"
              + "\n*                                                     *"
              + "\n*      Item           Attack           Defense        *"
              + "\n*-----------------------------------------------------*";
        ArrayList<Item> inventory = GameCharacter.Player.getInventory();
        for (int i = 0; i < 2; i++) {

            String currentItem = "\t";

            if (i < inventory.size())
                currentItem = inventory.get(i).getItemName();

            displayMessage += ("\n* " + (i + 1) + " - " + currentItem
                    + "\t"
                    + Item.Hammer.getAttackBonus()
                    + "\t\t"
                    + Item.Toothbrush.getDefenceBonus()
                    + "             *");
                    //+ String.format("%38s", " ") + "*");

        }

        displayMessage+=
              "\n*-----------------------------------------------------*"
            + "\n* D - Drop Item        S - View Inventory Stats       *"
            + "\n* E - Equip Item                                      *"
            + "\n* Q - Quit                                            *"
            + "\n*******************************************************"
            + "\n\tWhat would you like to do? ";        
        return displayMessage;
    }
    
    private String getInventoryBlockMessage() {
        GameCharacter.Player.addInventoryItem(Item.Hammer);
        GameCharacter.Player.addInventoryItem(Item.Toothbrush);

        String inventoryDisplayBlock = 
                "***********************Inventory***********************"
            + "\n*                                                     *";
        ArrayList<Item> inventory = GameCharacter.Player.getInventory();
        for (int i = 0; i < 4; i++) {
//the default is always resert to empty
            String currentItem = "\t\t";
//while there is still something in the inventory, display it
            if (i < inventory.size())
                currentItem = inventory.get(i).getItemName();
//the default \t\t is used if the statement isn't met.
            inventoryDisplayBlock += ("\n* " + (i + 1) + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
//"***********************Inventory***********************"
//+ "\n* The First portion of the code does this display     *" 
//+ "\n* portion, factoring in the items in the inventory    *"
//+ "\n* this is all given that there are a max of 4 items   *"
//+ "\n* in the inventory MAX.  Equiped will be a different  *"
//+ "\n* view, to not detract from inventory size.           *"
        inventoryDisplayBlock += 
    "\n*                                                     *"
  + "\n* D - Drop Item        S - View Inventory Stats       *"
  + "\n* E - Equip Item                                      *"
  + "\n* Q - Quit                                            *"
  + "\n*******************************************************"
  + "\n\tWhat would you like to do? ";

        return inventoryDisplayBlock;
    }
}
