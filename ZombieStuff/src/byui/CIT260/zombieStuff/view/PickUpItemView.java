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
class PickUpItemView extends View {

    public PickUpItemView() {
        super("ERROR: This object was called wrong!!");
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
            return false;
        }

        try {
            InventoryControl.pickUpItemFromLocation(input - 1);
        } catch (InventoryControlException e) {
            ErrorView.display("DropItemView.doAction()", e.getMessage());
            return false;
        }
        this.displayMessage = this.getInventoryBlockMessage();

        return true;
    }

    private String getInventoryBlockMessage() {
        String inventoryDisplayBlock
                = "*********************Pick up Item**********************"
                + "\n*                                                     *";
        ArrayList<Item> locationInventory = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation()).getItemsInThisLocation();
        for (int i = 0; i < 4; i++) {
            String currentItem = "\t\t";
            if (i < locationInventory.size()) {
                currentItem = locationInventory.get(i).getItemName();
            }
            inventoryDisplayBlock += ("\n* " + (i + 1) + " - " + currentItem
                    + String.format("%38s", " ") + "*");
        }
        inventoryDisplayBlock
                += "\n* Q - Quit                                            *"
                + "\n* To pick up an item, enter a number between 1 and 4  *"
                + "\n* if there is no Item in that spot, you will be       *"
                + "\n* promted again, for a different number               *"
                + "\n*******************************************************"
                + "\n\tWhich Item do you want to pick up? ";

        return inventoryDisplayBlock;
    }
}
