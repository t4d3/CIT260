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
public class HelpMenuView extends View{
    public HelpMenuView() {
      super("***************Help Menu****************"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move" 
                + "\nT - How much time will I have?"
                + "\nF - How to fight"
                + "\nD - Collecting/weilding items"
                + "\nQ - Quit"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(String menuOption) {
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
