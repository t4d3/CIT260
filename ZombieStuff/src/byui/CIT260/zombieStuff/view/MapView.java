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
    public void MapView() {
        System.out.println( 
  "\n          ___________________________"
+ "\n         |                           |*********Map View*********"
+ "\n         |                           |* M - Move the character *"
+ "\n         |            x,y            |* L - List visited places*"
+ "\n         |                           |*                        *"
+ "\n         |____________._.____________|*                        *"
+ "\n            |       |     |       |   * H - Get help           *"
+ "\n            |  x,y  I x,y I  x,y  |   *************************"
+ "\n ___________|_______|     |_______|                ___________"
+ "\n|           |       |     |       |_______________|           |"
+ "\n|           |  x,y  I x,y I  x,y  |  x,y  |  x,y  |           |"
+ "\n|           |_______|     |__._.__|__._.__|__._.__|           |"
+ "\n|           |                                     |           |"
+ "\n|    x,y    I  x,y    x,y    x,y     x,y     x,y  I    x,y    |"
+ "\n|           |________._._.________________________|           |"
+ "\n|           |                                     |           |"
+ "\n|___________|                                     |___________|" );
    }

    public void displayMap() {
        boolean done = false;
        do {
            this.MapView();
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
                    this.movePlayer();
                    break;
            case "L":
                    this.previousePlaceView();
                    break;
            case "H":
                    this.displayHelpMenu();
                    break;
/*            case "S":
                    this.saveGame();
                    break;*/
            case "Q":
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void previousePlaceView() {
                System.out.println("\n***PreviousePlacesView()***");
    }

    private void movePlayer() {
                System.out.println("\n***movePlayer()***");
    }

    private void displayHelpMenu() {
                System.out.println("\n***displayHelpMenu()***");
    }


}
