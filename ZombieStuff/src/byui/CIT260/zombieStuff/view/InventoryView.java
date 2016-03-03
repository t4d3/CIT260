/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author T4d3-T550
 */
public class InventoryView extends View {
    public InventoryView() {
              super("****************Inventory******************"
                + "\n* D - Delete Item                         *"
                + "\n* E - Equip Item                          *"
                + "\n* F - Go to the Food Court                *"
                + "\n* Q - Quit                                *"
                + "\n*******************************************");
    }
    
    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "D" :
                this.deleteItem();
                break;
            case "E" :
                this.equipItem();
                break;
            case "Q":
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
            
        }
        return false;
    }

    private void deleteItem() {
        DeleteItemView deleteItemView = new DeleteItemView();
        deleteItemView.display();
    }

    private void equipItem() {
        EquipItemView equipItemview = new EquipItemView();
        equipItemview.display();
    }

    
}
