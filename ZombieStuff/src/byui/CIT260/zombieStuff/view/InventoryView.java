/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.InventoryControl;
import byui.CIT260.zombieStuff.model.Item;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.IIOException;
import zombiestuff.ZombieStuff;

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
            case "D":
                this.dropItem();
                break;
            case "E":
                this.equipItem();
                break;
            case "A":
                this.addItems();
                break;
            case "S":
                this.viewInventoryStats();
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        this.displayMessage = getInventoryBlockMessage();
        return false;
    }

    private void dropItem() {
        DropItemView dropItemView = new DropItemView();
        dropItemView.display();
    }

    private void equipItem() {
    }

    private String viewInventoryStats() {
        this.displayMessage
                = "*****************Inventory Stats***********************"
                + "\n*                                                     *"
                + "\n*      Item           Attack           Defense        *"
                + "\n*-----------------------------------------------------*";
        ArrayList<Item> inventory;
        inventory = ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory();
        for (int i = 0; i < 4; i++) {

            String currentItem = "\n* " + (i + 1) + " -                                                 *";

            if (i < inventory.size()) {

                currentItem = ("\n* " + (i + 1) + " - " + inventory.get(i).getItemName()
                        + "\t"
                        + inventory.get(i).getAttackBonus()
                        + "\t\t"
                        + inventory.get(i).getDefenceBonus()
                        + "             *");
            }
            //+ String.format("%38s", " ") + "*");
            displayMessage += currentItem;
        }

        displayMessage
                += "\n*-----------------------------------------------------*"
                + "\n* D - Drop Item        S - View Inventory Stats       *"
                + "\n* E - Equip Item                  A - add items       *"
                + "\n* Q - Quit                                            *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";
        return displayMessage;
    }

    private String getInventoryBlockMessage() {
        String inventoryDisplayBlock
                = "***********************Inventory***********************"
                + "\n*                                                     *";
        ArrayList<Item> inventory = ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory();
        for (int i = 0; i < 4; i++) {
//the default is always resert to empty
            String currentItem = "\t\t";
//while there is still something in the inventory, display it
            if (i < inventory.size()) {
                currentItem = inventory.get(i).getItemName();
            }
//the default \t\t is used if the statement isn't met.
            inventoryDisplayBlock += ("\n* " + (i + 1) + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
        inventoryDisplayBlock
                += "\n*                                                     *"
                + "\n* D - Drop Item        S - View Inventory Stats       *"
                + "\n* E - Equip Item                  A - add items       *"
                + "\n* Q - Quit                                            *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";

        return inventoryDisplayBlock;
    }

    private void addItems() {
        InventoryControl.addItem(Item.Hammer);
    }
}
