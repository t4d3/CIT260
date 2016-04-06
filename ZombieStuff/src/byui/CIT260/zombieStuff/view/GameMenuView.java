/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("***********************Game menu***********************"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *");
        displayMessage += this.getDefaultFooter();
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
            case "T":
                this.displayTime();
                break;
            case "U":
                this.movePlayer();
                break;
            case "I":
                this.InventoryView();
                break;
            case "S":
                this.shopCurrentStore();
                break;
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

    private void PrintItemView() {
        PrintItemView printView = new PrintItemView();
        printView.display();
    }

    private void displayTime() {
        this.displayMessage = "***********************Game menu***********************"
                + "\n*                                                     *"
                + "\n* Max time: " + ZombieStuff.getCurrentGame().getMaxTime()
                + " minutes used: " + ZombieStuff.getCurrentGame().getUsedTime()
                + " minutes remaining: " + (ZombieStuff.getCurrentGame().getMaxTime()
                - ZombieStuff.getCurrentGame().getUsedTime())
                + "  *"
                + "\n*                                                     *"
                + this.getDefaultFooter();
    }

    private String getDefaultFooter() {
        String defaultFooter = "\n* S - Shop in the current store                       *"
                + "\n* P - Print all Items in the game, to a file          *"
                + "\n* M - Manifestation of the Map                        *"
                + "\n* I - Inventory inspection                            *"
                + "\n* T - Tell the time remaining and such                *"
                + "\n* Q - Quit                                            *"
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";
        return defaultFooter;
    }

    private void shopCurrentStore() {
        while (GameControl.zombieTest()) {
            FightZombieView fightZombieView = new FightZombieView();
            fightZombieView.display();
        }
        if (!GameControl.zombieTest()) {
            ShopView shopView = new ShopView();
            shopView.display();
        }
    }
}
