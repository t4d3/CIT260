/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.CalcTravelTime;
import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.model.GameCharacter;
import java.awt.Point;
import java.util.Scanner;

public class MovePlayerView extends View{
    public MovePlayerView() {
        super("*********Directory Listing**********"
                + "\n*     First Floor     |  Second Floor     *"
                + "\n* A - Go to a store    N -                *"
                + "\n* B -                  O -                *"
                + "\n* C - Go to            P -                *"
                + "\n* D - Go to            Q - Quit           *"
                + "\n* E - Go to            R - *"
                + "\n* F - Food Court       S - *"
                + "\n* G - Go to            T - *"
                + "\n* H - Help Menu        U -  *"
                + "\n* I - Go to            V - Victoria's Secret*"  
                + "\n* J - Go to            W - *"
                + "\n* K - Go to            X - *"
                + "\n* L - Go to            Y - *"
                + "\n* M - Go to            Z - *"
                + "\n*******************************************");
    }

    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();
        GameCharacter character = new GameCharacter();
        int timeUsed = GameControl.updateLocation(menuOption, character);
        //if time used is negative
        //display error messagage RETURN FALSE;
        //
        //
//this might have to be in a while loop, for the sake of having two floors
/*        switch (menuOption) {
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
    return pointB;*/    
    return true;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}
