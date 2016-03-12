/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
import java.util.ArrayList;

/**
 *
 * @author T4d3-T5500
 */
public class InventoryView extends View {

    public InventoryView() {
        super(//"***********************Inventory***********************"
//+ "\n* This is being taken care of by the main menu now... *" 
//+ "\n* I cannot find a way to impliment the                *"
//+ "\n*         DisplayInventoryBlockMessage()              *"
//+ "\n*                                                     *"
      "*                                                     *"
  + "\n* D - Drop Item                                       *"
  + "\n* E - Equip Item                                      *"
  + "\n* Q - Quit                                            *"
  + "\n*******************************************************"
  + "\n\tWhat would you like to do? ");
    }
    
    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "D" :
                this.dropItem();
                break;
            case "E" :
                this.equipItem();
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void dropItem() {
        DropItemView DropItemView = new DropItemView();
        DropItemView.display();

    }

    private void equipItem() {
        EquipItemView equipItemview = new EquipItemView();
        equipItemview.display();
    }
    
    private String DisplayInventoryBlockMessage() {
//Suedo code, filling the gameCharacter's inventory
        GameCharacter.Player.addInventoryItem(Item.Hammer);
        GameCharacter.Player.addInventoryItem(Item.Toothbrush);

        String inventoryDisplayBlock = "***********************Inventory***********************";
        ArrayList<Item> inventory = GameCharacter.Player.getInventory();
//replace the .size() with an absolute, once we decide the inventory size
        for (int i = 0; i < inventory.size(); i++) {
            String currentItem = "\t\t";
            if (!"\n".equals(inventory.get(i).getItemName()))
                currentItem = inventory.get(i).getItemName();
            inventoryDisplayBlock += ("\n* " + i + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
        return inventoryDisplayBlock;
    }
}