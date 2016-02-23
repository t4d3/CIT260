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

    public GameMenuView() {
        System.out.println("****************Game menu******************"
                + "* G - Go to a store                       *"
                + "* M - Display the Map                     *"
                + "*******************************************");
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
                System.out.println("ERROR: Invalid entry; must be one letter");
            else valid = true;
        } while (!valid);
        return value;
    }
    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M" :
                    this.MapView();
                    break;
                    /*            case "R":
                    this.startExistingGame();
                    break;
                    case "H":
                    this.displayHelpMenu();
                    break;
                    case "S":
                    this.saveGame();
                    break;
                    case "Q":
                    this.quitGame();
            break;*/
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
            
        }
        return false;
    }

    private void MapView() {
        MapView mapView = new MapView();
        mapView.MapView();
    }

}
