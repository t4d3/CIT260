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
public class GameMenuView extends View {

    public GameMenuView() {
        super("***********************Game menu***********************"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n* P - Print all Items in the game, to a file          *"
                + "\n* M - Manifestation of the Map                        *"
                + "\n* F - Fight a Zombie                                  *"
                + "\n* I - Inspect your Inventory                          *"
                + "\n* T - Tell the remaining Time                         *"
                + "\n* Q - Quit                                            *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ");
    }

    @
            Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M":
                this.MapView();
                break;
            case "P":
                this.PrintItemView();
                break;
            case "U":
                this.movePlayer();
                break;
            case "F":
                this.FightZombieView();
                break;
            case "I":
                this.InventoryView();
                break;
            case "B":
                this.FightZombieView();
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void MapView() {
        MapView mapView = new MapView();
        mapView.display();
    }

    private void movePlayer() {
    }

    private void FoodMenuView() {
        FoodMenuView foodMenuView = new FoodMenuView();
        foodMenuView.display();
    }

    private void InventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void FightZombieView() {
        FightZombieView fightZombieView = new FightZombieView();
        fightZombieView.display();
    }

    private void PrintItemView() {
        PrintItemView printView = new PrintItemView();
        printView.display();
    }

}
