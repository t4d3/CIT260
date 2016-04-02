/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.InventoryControl;
import byui.CIT260.zombieStuff.model.Item;
import java.util.ArrayList;
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
                this.displayMessage = getInventoryBlockMessage();
                break;
            case "E":
                this.equipItem();
                this.displayMessage = getInventoryBlockMessage();
                break;
            case "AH":
                this.addItems(Item.Hammer);
                this.displayMessage = getInventoryBlockMessage();
                break;
            case "AT":
                this.addItems(Item.Toothbrush);
                this.displayMessage = getInventoryBlockMessage();
                break;
            case "AS":
                this.addItems(Item.Shoes);
                this.displayMessage = getInventoryBlockMessage();
                break;
            case "S":
                this.viewInventoryStats();
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void dropItem() {
        DropItemView dropItemView = new DropItemView();
        dropItemView.display();
    }

    private void equipItem() {
        EquipItemView equipItemView = new EquipItemView();
        equipItemView.display();
    }

    private void viewInventoryStats() {
        String inventoryDisplayBlock
                = "********************Inventory Stats********************"
                + "\n*      Item           Attack           Defense        *";
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
            inventoryDisplayBlock += currentItem;
        }

        inventoryDisplayBlock += this.getFooter();
        this.displayMessage = inventoryDisplayBlock;
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
        inventoryDisplayBlock += this.getFooter();

        return inventoryDisplayBlock;
    }

    private String getFooter() {
        String footer
                = "\n*                                                     *"
                + "\n* D - Drop Item        S - View Inventory Stats       *"
                + "\n* E - Equip Item                                      *"
                + "\n* Q - Quit                                            *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";
        return footer;
    }

    private void addItems(Item item) {
        InventoryControl.addItem(item);
    }
}
