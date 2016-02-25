/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import java.util.Scanner;

/**
 *
 * @author T4d3-T550
 */
public class GameMenuView {

    private void GameMenuView() {
        System.out.println("****************Game menu******************"
                + "\n* G - Go to a store                       *"
                + "\n* M - Display the Map                     *"
                + "\n* F - Go to the Food Court                *"
                + "\n*******************************************");
    }

    public void displayMenu() {
        boolean done = false;
        do {
            this.GameMenuView();
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid;
        valid = false;
        do {
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() != 1)
                System.out.println("ERROR: Invalid entry...must be one letter");
            else valid = true;
        } while (!valid);
        return value;
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M" :
                    this.MapView();
                    break;
            case "U":
                    this.movePlayer();
                    break;
            case "F":
                    this.FoodMenuView();
                    break;
/*            case "S":
                    this.saveGame();
                    break;*/
            case "Q":
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void MapView() {
        MapView mapView = new MapView();
        mapView.displayMapView();
    }

    private void movePlayer() {
        System.out.println("*** movePlayer() ***");
    }
    
    private void FoodMenuView() {
        FoodMenuView foodMenuView = new FoodMenuView();
        foodMenuView.displayFoodMenu();
    }

}
