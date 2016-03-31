/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.InventoryControl;
import byui.CIT260.zombieStuff.exceptions.InventoryControlException;
import byui.CIT260.zombieStuff.model.Item;
import java.util.ArrayList;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class DropItemView extends View {

    public DropItemView() {
        super("");
        this.displayMessage = this.getInventoryBlockMessage();
    }

    @Override
    public boolean doAction(String menuOption) {
        int input = 0;
        try {
            input = Integer.parseInt(menuOption);
        } catch (NumberFormatException e) {
            ErrorView.display("InventoryView.getInput", e.getMessage());
        }

        if (1 > input || input > 4) {
            return true;
        }

        try {
            InventoryControl.dropItem(input - 1);
        } catch (InventoryControlException e) {
            ErrorView.display("DropItemView.doAction()", e.getMessage());
            return false;
        }

        return true;
    }

    private String getInventoryBlockMessage() {
        String inventoryDisplayBlock
                = "***********************Inventory***********************"
                + "\n*                                                     *";
        ArrayList<Item> inventory = ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory();
        for (int i = 0; i < 4; i++) {
            String currentItem = "\t\t";
            if (i < inventory.size()) {
                currentItem = inventory.get(i).getItemName();
            }
            inventoryDisplayBlock += ("\n* " + (i + 1) + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
        inventoryDisplayBlock
                += "\n* Q - Quit                                            *"
                + "\n* To drop an item, enter a number between 1 and 4     *"
                + "\n* if there is no Item in that spot, you will be       *"
                + "\n* promted again, for a different number               *"
                + "\n*******************************************************"
                + "\n\tWhich Item do you want to drop? ";

        return inventoryDisplayBlock;
    }
}
