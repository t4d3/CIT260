/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.CalcTravelTime;
import byui.CIT260.zombieStuff.view.HelpMenuView;
import java.awt.Point;
import java.util.Scanner;

public class MovePlayerView {
    private void movePlayerView() {
        System.out.println("*********Directory Listing**********"
                + "\n*     First Floor     |  Second Floor     *"
                + "\n* A - Go to a store    N -                *"
                + "\n* B - Display the Map  O -                *"
                + "\n* D - Go to            P -                *"
                + "\n* E - Go to            Q - Quit*"
                + "\n* F - Go to *"
                + "\n* G - Go to *"
                + "\n* H - Display Help Menu *"
                + "\n*******************************************");
    }

    public void DisplayMovePlayerView() {
        Point pointB = null;
        this.movePlayerView();
        System.out.println("Where do you want to go? ");
        String menuOption = this.getMenuOption();
        Point desiredLocation;
        if (menuOption.toUpperCase().equals("Q"))
            return;
        pointB = this.doAction(menuOption);
        CalcTravelTime checkTime = new CalcTravelTime();
// This is the hardcoding, getting ready for real variables
        Point ALocation = new Point(3,4);
        Point BLocation = new Point(pointB);
        int timeUsed = 119;
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
            case "H":
                this.displayHelpMenu();
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
