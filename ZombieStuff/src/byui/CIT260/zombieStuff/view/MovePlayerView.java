/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovePlayerView extends View {

    public MovePlayerView() {
        super("*******************Directory Listing*******************"
                + "\n*      First Floor                 Second Floor       *"
                + "\n* A -                         L - Lids                *"
                + "\n* B -                         M -                     *"
                + "\n* C - Claire's                N - Nike                *"
                + "\n* D -                         O - Old Navy            *"
                + "\n* E -                         P -                     *"
                + "\n* F - Food Court              Q - Quit                *"
                + "\n* G - GameStop                R - Rue 21              *"
                + "\n* H - Hallway                 S -                     *"
                + "\n* I -                         T - Target              *"
                + "\n* J - JCPenney                U -                     *"
                + "\n* K - Kay Jewelers            V - Victoria's Secret   *"
                + "\n*******************************************************"
                + "\n\tWhere would you like to go? "
        );
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        Point desiredLocation = new Point(0, 0);
        switch (menuOption) {
//            case "A":
//                desiredLocation.setLocation(1, 1);
//                break;
//            case "B":
//                desiredLocation.setLocation(0, 0);//first floor
//                break;
            case "C":
                desiredLocation.setLocation(6, 1);//first floor
                break;
//            case "D":
//                desiredLocation.setLocation(1, 2);//first floor
//                break;
            case "F":
                desiredLocation.setLocation(1, 3);//second floor
                break;
            case "G":
                desiredLocation.setLocation(1, 0);//first floor
                break;
            case "H":
                desiredLocation.setLocation(2, 1);//this will be more challenging
                break;
//            case "I":
//                desiredLocation.setLocation(3, 2);//first floor
//                break;
            case "J":
                desiredLocation.setLocation(3, 0);//first floor
                break;
            case "K":
                desiredLocation.setLocation(4, 0);//second floor
                break;
            case "L":
                desiredLocation.setLocation(4, 2);//first floor
                break;
//            case "M":
//                desiredLocation.setLocation(1, 1);//Second floor
//                break;
            case "N":
                desiredLocation.setLocation(3, 2);//Second floor
                break;
            case "O":
                desiredLocation.setLocation(3, 3);//second floor
                break;
//            case "P":
//                desiredLocation.setLocation(3, 1);//Second floor
//                break;
            case "R":
                desiredLocation.setLocation(5, 2);//Second floor
                break;
//            case "S":
//                desiredLocation.setLocation(4, 1);//first and second floor
//                break;
            case "T":
                desiredLocation.setLocation(0, 1);//Second floor
                break;
//            case "U":
//                desiredLocation.setLocation(5, 1);//Second floor
//                break;
            case "V":
                desiredLocation.setLocation(2, 4);
                break;
            /*case "W":
                desiredLocation.setLocation(0, 0);
                break;
                case "X":
                desiredLocation.setLocation(0, 0);
                break;
                case "Y":
                desiredLocation.setLocation(0, 0);
                break;
                case "Z":
                desiredLocation.setLocation(0, 0);
            break;*/
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        try {
            GameControl.updateLocation(desiredLocation);
        } catch (GameControlException ex) {
            Logger.getLogger(MovePlayerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ShopView shopView = new ShopView();
        shopView.display();
        return true;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}
