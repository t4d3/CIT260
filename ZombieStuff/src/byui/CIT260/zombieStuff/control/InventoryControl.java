/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.InventoryControlException;
import byui.CIT260.zombieStuff.model.Item;
import java.awt.Point;
import java.util.ArrayList;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Sucks
 */
public class InventoryControl {

    public static void equipItem(int itemIndex) throws InventoryControlException {
        Item item = null;
        try {
            item = ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory().get(itemIndex);
            ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory().remove(itemIndex);
            ZombieStuff.getCurrentGame().getPlayerCharacter().setEquiped(item);

        } catch (IndexOutOfBoundsException e) {
            throw new InventoryControlException("No Item here! " + e.getMessage());
        }
    }

    InventoryControl() {
    }

    public static void addItem(Item item) {
        ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory().add(item);
    }

    public static void pickUpItemFromLocation(int itemIndex) throws InventoryControlException {
        Item item;

        try {
            Point currentLocation = ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation();
            item = ZombieStuff.getCurrentGame().getMap().getLocation(currentLocation).getItemFromLocation(itemIndex);
            InventoryControl.addItem(item);
            ZombieStuff.getCurrentGame().getMap().getLocation(currentLocation).removeItemFromLocation(itemIndex);
        } catch (IndexOutOfBoundsException e) {
            throw new InventoryControlException("No Item here! " + e.getMessage());
        }

    }

    public static void dropItem(int itemIndex) throws InventoryControlException {
        Item item = null;

        try {
            item = ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory().get(itemIndex);
        } catch (IndexOutOfBoundsException e) {
            throw new InventoryControlException("No Item here! " + e.getMessage());
        }
        Point currentLocation = ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation();

        ZombieStuff.getCurrentGame().getMap().getLocation(currentLocation.x, currentLocation.y).addItemToLocation(item);

        try {
            ZombieStuff.getCurrentGame().getPlayerCharacter().getInventory().remove(item);
        } catch (IndexOutOfBoundsException e) {
            throw new InventoryControlException("No Item to drop! " + e.getMessage());
        }
    }

    public static int getInventoryWeight(ArrayList<Item> inventory) {
        int totalWeight = 0;
        for (Item tmp : inventory) {
            totalWeight += tmp.getWeight();
        }
        return totalWeight;
//code here
    }
}
