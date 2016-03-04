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
  "\n          ___________________________ ********Map View**********"
+ "\n         |                           |* F - Food Court         *"
+ "\n         |                           |* M - Move the character *"
+ "\n         |      Victoria's Secret    |* L - List visited places*"
+ "\n         |                           |* S - Shop current store *"
+ "\n         |____________._.____________|* H - Display Help menu  *"
+ "\n            |       |     |  Old  |   * Q - Exit back to menu  *"
+ "\n            | Food  I x,y I  Navy |   **************************"
+ "\n ___________|_______|     |_______|___________________________"
+ "\n|           |       |     |       |       |       |           |"
+ "\n|           |Zumies I x,y I  Nike | Zales |Stairs |           |"
+ "\n|           |_______|     |__._.__|__._.__|__._.__|           |"
+ "\n|  Target   I  x,y    x,y    x,y     x,y     x,y  I  Claire's |"
+ "\n|           |________._._.________________________|           |"
+ "\n|           |                                     |           |"
+ "\n|___________|                                     |___________|");
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
            case "Q":
                break;
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
                System.out.println("\n***displayHelpMenu()***");
    }


}
