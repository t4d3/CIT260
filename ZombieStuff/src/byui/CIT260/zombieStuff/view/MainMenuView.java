/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import zombiestuff.ZombieStuff;

public class MainMenuView extends View {

    public MainMenuView() {
        super("***********************Main Menu***********************"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n* N - New game                                        *"
                + "\n* H - Display a Help menu                             *"
                + "\n* R - Retrieve and resume game                        *"
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
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "N":
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
        try {
            GameControl.createNewGame(ZombieStuff.getPlayer());
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(),
                    "ERROR: " + e.getMessage());

            GameMenuView gameMenuView = new GameMenuView();
//This part should start into the game...Unlike most code, it is very important.
            gameMenuView.display();
        }
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
