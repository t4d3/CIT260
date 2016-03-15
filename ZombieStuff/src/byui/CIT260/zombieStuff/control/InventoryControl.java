/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Item;
import java.util.ArrayList;

/**
 *
 * @author Justin Sucks
 */
public class InventoryControl {
    InventoryControl() {
    }

    public static int getInventoryWeight(ArrayList<Item> inventory) {
        int totalWeight = 0;
        for(Item tmp: inventory) {
            totalWeight += tmp.getWeight();
        }
        return totalWeight;
//code here
    }
}