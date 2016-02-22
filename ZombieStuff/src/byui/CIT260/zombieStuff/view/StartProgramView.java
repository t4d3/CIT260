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
public class StartProgramView {
    
    private final String promptMessage;
    
    public StartProgramView(){
        this.displayBanner();
        this.promptMessage ="\nPlease enter your name: ";
    }

    private void displayBanner() {
        System.out.println("\n******************************************************"
                        + "\n* Welcome to the text based rpg game Zombie Mall!     *"
                        + "\n* In this game you are a dad whose daughter is having *"
                        + "\n* her birthday party but you forgot some things in    *"
                        + "\n* order for the party to be complete. You leave your  *"
                        + "\n* pot roast onthe stove and head to the mall infested *"
                        + "\n* with zombies to get the items that you forgot       *"
                        + "\n*******************************************************");
        
        System.out.println("\nFight the zombies, get the items, don't die, and get back to"
                        + "the party before the roast goes bad. Good luck!");
        
    }

    public void displayStartProgramView() {
        System.out.println("\n***displayProgramView function called ***");
        boolean done = false;
        do {
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playerName);
        } while (!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        System.out.println("\n*** getPlayerName() Call***");
        boolean valid;
        valid = false;
        while(!valid) {// a valid value has not been entered
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("Invalid enytry.  value cannot be blank!");
                continue;
            }
            
            break;
        }
        return value;
    }

    private boolean doAction(String playerName) {
        System.out.println("\n*** doAction() Call***");
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
    
    
    
    //end of program

    private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() Call***");
        System.out.println("\n*******************************************"
                          +"\nWelcome to the game, " + player.getName() + "."
                          +"\n We hope you get a really good experience"
                          +"\n from this delitefull game..."
                          +"\n*******************************************");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}