/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.model.Player;

/**
 *
 * @author Justin Cox
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("*******************************************************"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n* Welcome to the text based rpg game Zombie Mall!     *"
                + "\n* In this game you are a dad whose daughter is having *"
                + "\n* her birthday party but you forgot some things in    *"
                + "\n* order for the party to be complete. You leave your  *"
                + "\n* pot roast onthe stove and head to the mall infested *"
                + "\n* with zombies to get the items that you forgot       *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\n\tPlease enter your name: ");
    }

    @Override
    public boolean doAction(String playerName) {
        if (playerName.length() < 2) {
            System.out.println("Invalid entry...must be longer than one letter.");
            return false;
        }
        try {
            Player player = GameControl.createPlayer(playerName);
            this.displayNextView(player);

        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(),
                    "ERROR: " + e.getMessage());
        }
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("*******************************************"
                + "\nWelcome " + player.getName() + ", Enjoy the Game!"
                + "\n*******************************************");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
