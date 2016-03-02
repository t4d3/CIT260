/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.model.Player;
import java.util.Scanner;

/**
 *
 * @author Justin Cox
 */
public class StartProgramView extends View {
    
    public StartProgramView() {
        super("*******************************************************"
                        + "\n* Welcome to the text based rpg game Zombie Mall!     *"
                        + "\n* In this game you are a dad whose daughter is having *"
                        + "\n* her birthday party but you forgot some things in    *"
                        + "\n* order for the party to be complete. You leave your  *"
                        + "\n* pot roast onthe stove and head to the mall infested *"
                        + "\n* with zombies to get the items that you forgot       *"
                        + "\n*******************************************************");
    }

    private void promptName() {
        System.out.println("\nPlease enter your name: ");
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid;
        valid = false;
        while(!valid) {// a valid value has not been entered
            this.promptName();
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {
                System.out.println("Invalid entry.  Value cannot be blank!");
                continue;
            }
            break;
        }
        return value;
    }

    @Override
    public boolean doAction(String playerName) {
        if (playerName.length() < 2) {
            System.out.println("Invalid entry...must be longer than one letter.");
            return false;
        }
        Player player = GameControl.createPlayer(playerName);
        
        if (player == null) {
            System.out.println("Error: cannot create player");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("*******************************************"
                +"\nWelcome " + player.getName() + ", Enjoy the Game!"
                +"\n*******************************************");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
