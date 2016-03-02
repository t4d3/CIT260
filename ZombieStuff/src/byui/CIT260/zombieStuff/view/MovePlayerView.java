/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.CalcTravelTime;
import java.awt.Point;
import java.util.Scanner;

public class MovePlayerView {
    private String displayMessage;
    private void MovePlayerView() {
        this.displayMessage = "*********Directory Listing**********"
                + "\n*     First Floor     |  Second Floor     *"
                + "\n* A - Go to a store    N -                *"
                + "\n* B - Display the Map  O -                *"
                + "\n* C - Go to            P -                *"
                + "\n* D - Go to            Q - *"
                + "\n* E - Go to            R - *"
                + "\n* F - Food Court       S - *"
                + "\n* G - Go to            T - *"
                + "\n* H - Help Menu        U -  *"
                + "\n* I - Go to            V - Victoria's Secret*"  
                + "\n* J - Go to            W - *"
                + "\n* K - Go to            X - *"
                + "\n* L - Go to            Y - *"
                + "\n* M - Go to            Z - *"
                + "\n*******************************************";
    }

    public void DisplayMovePlayerView() {
        Point pointB = null;
        System.out.println(this.displayMessage);
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
        int timeUsed = 10;
        int maxTime = 120;
// This is the end of the hardcoding...  REPLACE THIS CODE!
        int travelTime = checkTime.calcTravelTime(ALocation, BLocation, timeUsed, maxTime);
        if (travelTime > 0) {
            ALocation = BLocation;
            timeUsed += travelTime;
            System.out.println("Sounds great, it took you " + travelTime
            + " minutes to get there!");
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
//this might have to be in a while loop, for the sake of having two floors
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
                    pointB.setLocation(0,0);
                    break;
            case "E":
                    pointB.setLocation(0,0);
                    break;
            case "F":
                    pointB.setLocation(0,0);
                    break;
            case "G":
                    pointB.setLocation(0,0);
                    break;
            case "H":
                    this.displayHelpMenu();
                    break;
            case "I":
                    pointB.setLocation(0,0);
                    break;
            case "J":
                    pointB.setLocation(0,0);
                    break;
            case "K":
                    pointB.setLocation(0,0);
                    break;
            case "L":
                    pointB.setLocation(0,0);
                    break;
            case "M":
                    pointB.setLocation(0,0);
                    break;
            case "N":
                    pointB.setLocation(0,0);
                    break;
            case "O":
                this.displayHelpMenu();
                break;
            case "P":
                    pointB.setLocation(0,0);
                    break;
            case "Q":
                break;
            case "R":
                    pointB.setLocation(0,0);
                    break;
            case "S":
                    pointB.setLocation(0,0);
                    break;
            case "T":
                    pointB.setLocation(0,0);
                    break;
            case "U":
                    pointB.setLocation(0,0);
                    break;
            case "V":
                    pointB.setLocation(0,0);
                    break;
            case "W":
                    pointB.setLocation(0,0);
                    break;
            case "X":
                    pointB.setLocation(0,0);
                    break;
            case "Y":
                    pointB.setLocation(0,0);
                    break;
            case "Z":
                    pointB.setLocation(0,0);
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
