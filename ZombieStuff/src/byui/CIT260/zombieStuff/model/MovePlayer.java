/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import byui.CIT260.zombieStuff.control.CalcTravelTime;
import byui.CIT260.zombieStuff.view.HelpMenuView;
import java.awt.Point;
import java.util.Scanner;

/**
 *List the 25 or so locations here, for the sake of keeping track of things:
* 1     Victoria's Secret
* 2     Old Navy
* 3     Sears
* 4     Zumies
* 5     Claire's
* 6     Stairs
* 7     Zales
* 8     Nike
* 9     Target
* 10    
* 11    
* 12    
* 13    
* 14    
* 15    
* 16    
* 17    
* 18    
* 19    
* 20    
* 21    
* 22    
* 23    
* 24    
* 25    
*/
public class MovePlayer {
    private Point desiredLocation;
    public void MovePlayer() {
        Point pointB = null;
        System.out.println("Where do you want to go? ");
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q"))
            return;
        pointB = this.doAction(menuOption);
        CalcTravelTime checkTime = new CalcTravelTime();
// This is the hardcoding, getting ready for real variables
        Point ALocation = new Point(3,4);
        Point BLocation = new Point(pointB);
        int timeUsed = 0;
        int maxTime = 120;
// This is the end of the hardcoding...  REPLACE THIS CODE!
        int travelTime = checkTime.calcTravelTime(ALocation, BLocation, timeUsed, maxTime);
        if (travelTime > 0) {
            ALocation = BLocation;
            timeUsed += travelTime;
            System.out.println("Sounds great, you used " + timeUsed
            + " minuts!");
        }
        else if (travelTime == -3)
            System.out.println("ERROR: you will be out of timeif you do this!");
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
                System.out.println("ERROR: Invalid entry...must be one letter");
            else valid = true;
        } while (!valid);
        return value;
    }

    private Point doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();
        Point pointB = new Point();

        switch (menuOption) {
            case "A" :
                    pointB.setLocation(0,0);
                    break;
            case "B":
                    pointB.setLocation(0,1);
                    break;
            case "C":
                    pointB.setLocation(0,2);
                    break;
            case "D":
                    pointB.setLocation(0,3);
                    break;
            case "Q":
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return pointB;
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

}
