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
public class MapView {
    private String displayMessage;
    public void displayMap() {
        this.displayMessage = 
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
+ "\n|___________|                                     |___________|";
    }

    public void displayMapView() {
        boolean done = false;
        do {
            System.out.println(this.displayMessage);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
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
    private boolean doAction(String menuOption) {
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
        movePlayerView.DisplayMovePlayerView();
    }

    private void visitedPlaceView() {
                System.out.println("\n***PreviousePlacesView()***");
    }

    private void displayHelpMenu() {
                System.out.println("\n***displayHelpMenu()***");
    }


}
