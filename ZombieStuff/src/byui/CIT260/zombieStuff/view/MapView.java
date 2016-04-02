/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.Location;
import byui.CIT260.zombieStuff.model.Map;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class MapView extends View {

    public MapView() {
        super(
                "          ___________________________ ********Map View**********"
                + "\n         |                           |*                        *"
                + "\n         |                           |* M - Move the character *"
                + "\n         |     Victoria's Secret     |* L - List visited places*"
                + "\n         |                           |* H - Display Help menu  *"
                + "\n         |____________._.____________|* Q - Exit back to menu  *"
                + "\n            |        |   |  Old   |   *                        *"
                + "\n            | Food   I   I  Navy  |   **************************"
                + "\n ___________|________|   |________|_____________________________"
                + "\n|           |        |   |        |        |        |           |"
                + "\n|           |Zumies  I   I  Nike  | Lids   |Rue 21  |           |"
                + "\n|           |________|   |__._.___|__._.___|___._.__|           |"
                + "\n|  Target   I                                       I  Claire's |"
                + "\n|           |_________._._.____Hall_Way_____________|           |"
                + "\n|           |            |            |             |           |"
                + "\n|___________|__GameStop__|___JCPenney_|Kay Jewelers_|___________|"
                + "\n\tWhat would you like to do? ");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "M":
                return this.movePlayerView();
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

    private boolean movePlayerView() {
        MovePlayerView movePlayerView = new MovePlayerView();
        movePlayerView.display();
        return true;
    }

    private void visitedPlaceView() {
        Map map = ZombieStuff.getCurrentGame().getMap();
        int noOfRows = map.getNoOfRows();
        int noOfColumns = map.getNoOfColumns();
        System.out.print("You have visited: ");
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                if (map.getLocation(column, row).getIsVisited()) {
                    System.out.print(map.getLocation(column, row).getName() + "; ");
                }
            }
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
