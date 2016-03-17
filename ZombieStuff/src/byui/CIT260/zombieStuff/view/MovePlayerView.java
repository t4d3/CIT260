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
        super(    "*******************Directory Listing*******************"
+ "\n*     First Floor                 Second Floor        *"
+ "\n* A - Aldo                    N - Nike                *"
+ "\n* B - Bed Bath and Beyond     O - Old Navy            *"
+ "\n* C - Claire's                P - Pink                *"
+ "\n* D - Dickies                 Q -        Quit         *"
+ "\n* E - Go to                   R - Rue 21              *"
+ "\n* F - Food Court              S - Stairs              *"
+ "\n* G - GameStop                T - Target              *"
+ "\n* H - Hallway                 U - Uber                *"
+ "\n* I - Ink Shop                V - Victoria's Secret   *"
+ "\n* J - JCPenney                W - Wag                 *"
+ "\n* K - Kay Jewelers            X - Xuppa               *"
+ "\n* L - Lids                    Y - YMCA                *"
+ "\n* M - Maurices                Z - Zumies              *"
+ "\n*******************************************************"
+ "\n\tWhere would you like to go? "
);
    }

    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();
        int timeUsed = GameControl.updateLocation(menuOption, GameCharacter.Player);
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
pointB.setLocation(map.getlocation("Victoria's Secret"));
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
