/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.CalcTravelTime;
import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.model.GameCharacter;
import java.awt.Point;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovePlayerView extends View{
    public MovePlayerView() {
        super(    "*******************Directory Listing*******************"
+ "\n*      First Floor                 Second Floor       *"
+ "\n* A - Aldo                    N - Nike                *"
+ "\n* B - Bed Bath and Beyond     O - Old Navy            *"
+ "\n* C - Claire's                P - Pink                *"
+ "\n* D - Dickies                 Q - Quit                *"
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
            //        try(GameControl.updateLocation();
//           catch( say why you cannot travel to that location)
        try {
            GameControl.updateLocation(menuOption, GameCharacter.Player);
        } catch (GameControlException ex) {
            Logger.getLogger(MovePlayerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    return true;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}
