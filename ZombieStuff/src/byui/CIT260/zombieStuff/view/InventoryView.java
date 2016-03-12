/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.Item;

/**
 *
 * @author T4d3-T5500
 */
public class InventoryView extends View {
    public InventoryView() {
              super("***********************Inventory***********************"
// while (GameCharacter.Player.inventory
//
//"\n* " + GameCharacter.Player.getInventory() + String.format("%38s", " ") + "*"
+ "\n* " + Item.Hammer.getItemName() + String.format("%38s", " ") + "*"
+ "\n* " + Item.Toothbrush.getItemName() + String.format("%38s", " ") + "*"
+ "\n* We can display the items here                       *"
+ "\n*                                                     *"
+ "\n*                                                     *"
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

    
}
