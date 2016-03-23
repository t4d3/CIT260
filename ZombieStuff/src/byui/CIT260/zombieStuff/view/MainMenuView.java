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
        super(    "***********************Main Menu***********************"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n* N - New game                                        *"
+ "\n* R - Retrieve and resume old game                    *"
+ "\n* H - Display a Help menu                             *"
+ "\n* S - Save game                                       *"
+ "\n* Q - Quit                                            *"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n*******************************************************"
+ "\n\tWhat would you like to do? "
);
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
        gameMenuView.display();
    }

    private void startExistingGame() {
        ExistingGameView existingGameView = new ExistingGameView();
        existingGameView.display();
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
