/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import java.util.Scanner;
import zombiestuff.ZombieStuff;
import byui.CIT260.zombieStuff.view.HelpMenuView;

public class MainMenuView extends View {
    public MainMenuView() {
        super("\n*************Main Menu***************"
                + "\nN - New game"
                + "\nR - Retrieve and resume old game"
                + "\nH - Display a Help menu"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n*************************************");
    }

    @Override
    public boolean doAction(String menuOption) {
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
        GameControl.createNewGame(ZombieStuff.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
//This part should start into the game...Unlike most code, it is very important.
        gameMenuView.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame() called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() called ***");
    }

    private void quitGame() {
        System.out.println("\n*** quitGame() called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
