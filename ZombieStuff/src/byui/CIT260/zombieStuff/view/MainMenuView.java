/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import java.util.Scanner;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class MainMenuView {
    private String menu;
    public void MainMenuView() {
        System.out.println( "\n*************Main Menu***************"
                          + "\nN - New game"
                          + "\nR - Retrieve and resume old game"
                          + "\nH - Display a Help menu"
                          + "\nS - Save game"
                          + "\nQ - Quit"
                          + "\n*************************************" );
    }
    public void HelpMenuView() {
        System.out.println("\n*** displayHelpMenu() called ***"
                + "****************Help Menu*****************"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move" 
                + "\nT - How much time will I have?"
                + "\nF - How to fight"
                + "\nD - Collecting/weilding items"
                + "\nQ - Quit"
                + "\n****************************************" );
    }
    public void displayMainMenuView() {
        boolean done = false;
        do {
            this.MainMenuView();
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() called***");
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid;
        valid = false;
        do {
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() != 1) {
                System.out.println("ERROR: Invalid entry; must be one letter");
            }
            else valid = true;
        } while (!valid);
        return value;
    }

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "N" :
                    this.startNewGame();
                    break;
            case "R":
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
                    break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
            
        }
        return false;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame() called ***");
        GameControl.createNewGame(ZombieStuff.getPlayer());
        System.out.println("*** startNewGame() called again ***");

        GameMenuView gameView = new GameMenuView();
        gameView.displayMenu();
//Create a new Game
//Create a new Game Menu View
//Display the Game Menu 
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() called ***");
    }

    private void displayHelpMenu() {
        boolean done = false;
        do {
            this.HelpMenuView();
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doHelpAction(menuOption);
        } while (!done);
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() called ***");
    }

    private void quitGame() {
        System.out.println("\n*** quitGame() called ***");
    }

    private boolean doHelpAction(String menuOption) {
        System.out.println("\n*** doHelpAction() called ***");
        menuOption = menuOption.toUpperCase();
        switch (menuOption) {
            case "G" :
                    System.out.println("This is how you ... goal"); //Goal of the game" 
                    break;
            case "M" :
                    System.out.println("This is how you ... move"); //How to move" 
                    break;
            case "T" :
                    System.out.println("This is how you ... tell time"); //How much time will I have?"
                    break;
            case "F" :
                    System.out.println("This is how you ... fight"); //How to fight"
                    break;
            case "D" :
                    System.out.println("This is how you ... deal with items"); //Collecting/weilding items"
                    break;
            case "Q" :
                    break;
            default :
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }
}