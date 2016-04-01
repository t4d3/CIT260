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
class EquipItemView extends View {

    public EquipItemView() {
        super("");
        displayMessage = this.getDisplayBlock();
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
            InventoryControl.equipItem(input - 1);
        } catch (InventoryControlException e) {
            ErrorView.display("EquipItemView.doAction()", e.getMessage());
            return false;
        }

        return true;
    }

    private String getDisplayBlock() {
        String inventoryDisplayBlock
                = "**********************Equip Items**********************"
                + "\n*                                                     *"
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

        inventoryDisplayBlock += "\n* Enter the Item you want to equip. If you enter an   *"
                + "\n* invalid item number, you will be repromted.         *"
                + "\n*                       Q - Quit                      *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";
        return inventoryDisplayBlock;
    }
}
