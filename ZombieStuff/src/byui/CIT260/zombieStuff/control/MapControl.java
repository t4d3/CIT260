/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.MapControlException;
import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Location;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Scene;
import java.awt.Point;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class MapControl {

    public static Map createMap() {
//Quite frankly, I have no idea what this is for.
        Map map = new Map(6, 4);

        return map;
    }

    public static void moveCharacterToStartingLocation(Map map)
            throws MapControlException {

        GameCharacter[] characters = ZombieStuff.getCurrentGame().getGameCharacters();

        for (GameCharacter character : characters) {
            Point coordinates = character.getCurrentLocation();
            MapControl.moveCharacterToLocation(character, coordinates);
        }
    }

    public static void moveCharacterToLocation(GameCharacter character, Point coordinates)
            throws MapControlException {
        Map map = ZombieStuff.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location "
                    + coordinates.x + ", " + coordinates.y + "because that location "
                    + "is outside the bounds of the map.");
        }
    }

    /*  "          ___________________________ ********Map View**********"
        + "\n         |                           |* M - Move the character *"
        + "\n         |                           |* L - List visited places*"
        + "\n         |     Victoria's Secret     |* S - Shop current store *"
        + "\n         |                           |*                        *"
        + "\n     04  |________14___24______34____|* 44       54        64  *"
        + "\n            |        |   |  Old   |   *                        *"
        + "\n            | Food   I   I  Navy  |   **************************"
        + "\n ____03_____|_____13_| 23|_____33_|_____43_______53________63___"
        + "\n|           |        |   |        |        |        |           |"
        + "\n|           |Zumies  I   I  Nike  | Lids   |Stairs  |           |"
        + "\n|    02     |_____12_| 22|_____32_|_____42_|_____52_|      62   |"
        + "\n|  Target   I                                       I  Claire's |"
        + "\n|    01     |_____11___21______31_______41_______51_|      61   |"
        + "\n|           |  GameStop  |  JCPenney  |Kay Jewelers |           |"
        + "\n|____00_____|_____10___20|_____30_____|_40_______50_|______60___|"
        + "\n\tWhat would you like to do? ");*/
    private static void assignScenesToLocations(Map map, Scene scene) {

        Location[][] locations = map.getLocations();

        locations[0][0].setScene(Scene.Target);
        locations[1][0].setScene(Scene.GameStop);
        locations[2][0].setScene(Scene.GameStop);
        locations[3][0].setScene(Scene.JCPenney);
        locations[4][0].setScene(Scene.Kay);
        locations[5][0].setScene(Scene.Kay);
        locations[6][0].setScene(Scene.Claires);
        locations[0][1].setScene(Scene.Target);
        locations[1][1].setScene(Scene.Hall);
        locations[2][1].setScene(Scene.Hall);
        locations[3][1].setScene(Scene.Hall);
        locations[4][1].setScene(Scene.Hall);
        locations[5][1].setScene(Scene.Hall);
        locations[6][1].setScene(Scene.Claires);
        locations[0][2].setScene(Scene.Target);
        locations[1][2].setScene(Scene.Zumies);
        locations[2][2].setScene(Scene.Hall);
        locations[3][2].setScene(Scene.Nike);
        locations[4][2].setScene(Scene.Lids);
        locations[5][2].setScene(Scene.Rue);
        locations[6][2].setScene(Scene.Claires);
        locations[0][3].setScene(Scene.Outside);//null
        locations[1][3].setScene(Scene.FoodCourt);
        locations[2][3].setScene(Scene.Hall);
        locations[3][3].setScene(Scene.OldNavy);
        locations[4][3].setScene(Scene.Outside);//null
        locations[5][3].setScene(Scene.Outside);//null
        locations[6][3].setScene(Scene.Outside);//null
        locations[0][4].setScene(Scene.Outside);//null
        locations[1][4].setScene(Scene.VictoriasSecret);
        locations[2][4].setScene(Scene.VictoriasSecret);
        locations[3][4].setScene(Scene.VictoriasSecret);
        locations[4][4].setScene(Scene.Outside);//null
        locations[5][4].setScene(Scene.Outside);//null
        locations[6][4].setScene(Scene.Outside);//null
    }
}
