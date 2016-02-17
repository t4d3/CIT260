/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author Justin Cox
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage ="\nPlease enter your name: ";
    //Display the banner screen
    this.displayBanner();
 //Get the players name
 //Create a new player
 //DISPLAY a customized welcome message
 //DISPLAY the main menu
}

    private void displayBanner() {
        System.out.println("\n\n****************************************");
        
        System.out.println("\nWelcome to the text based rpg game Zombie Mall*"
                        + "\n*In this game you are a dad whose daughter is having*"
                        + "\n*her birthday party but you forgot some things in order*"
                        + "\n*for the party to be complete. You leave your pot roast on*"
                        + "\n*the stove and head to the mall infested with zombies to*"
                        + "\n*get the items that you forgot*");
        
        System.out.println("Fight the zombies, get the items, don't die, and get back to"
                        + "the party before the roast goes bad. Good luck!");
        
    }

    public void displayStartProgramView() {
        System.out.println("\n***displayProgramView function called ***");
    }
}
