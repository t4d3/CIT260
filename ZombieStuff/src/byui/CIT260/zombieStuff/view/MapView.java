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
public class MapView extends View{
    public MapView() {
        super( 
    "          ___________________________ ********Map View**********"
+ "\n         |                           |* M - Move the character *"
+ "\n         |                           |* L - List visited places*"
+ "\n         |     Victoria's Secret     |* S - Shop current store *"
+ "\n         |                           |* H - Display Help menu  *"
+ "\n         |____________._.____________|* Q - Exit back to menu  *"
+ "\n            |        |   |  Old   |   *                        *"
+ "\n            | Food   I   I  Navy  |   **************************"
+ "\n ___________|________|   |________|_____________________________"
+ "\n|           |        |   |        |        |        |           |"
+ "\n|           |Zumies  I   I  Nike  | Zales  |Stairs  |           |"
+ "\n|           |________|   |__._.___|__._.___|___._.__|           |"
+ "\n|  Target   I                                       I  Claire's |"
+ "\n|           |_________._._.____Hall_Way_____________|           |"
+ "\n|           |                                       |           |"
+ "\n|___________|                                       |___________|"
+ "\n\tWhat would you like to do? ");
    }

    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M" :
                    this.movePlayerView();
                    break;
            case "L":
                    this.visitedPlaceView();
                    break;
            case "H":
                    this.displayHelpMenu();
                    break;
/*            case "?":
                    this.?();
                    break;*/
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void movePlayerView() {
        MovePlayerView movePlayerView = new MovePlayerView();
        movePlayerView.display();
    }

    private void visitedPlaceView() {
                System.out.println("\n***PreviousePlacesView()***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }


}
