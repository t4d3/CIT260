/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.MapControlException;
import byui.CIT260.zombieStuff.model.GameCharacter;
import static byui.CIT260.zombieStuff.model.GameCharacter.Player;
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
        Map map = new Map(20, 20);

        return map;
    }

    public static void moveCharacterToStartingLocation(Map map)
            throws MapControlException {
        GameCharacter[] character = GameCharacter.values();

        for (GameCharacter Character : character) {
            Point coordinates = Player.getCurrentLocation();
            MapControl.moveCharacterToLocation(Character, coordinates);
        }
    }

    public static void moveCharacterToLocation(GameCharacter character, Point coordinates)
            throws MapControlException {
        Map map = ZombieStuff.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location "
                    + coordinates.x + ", " + coordinates.y + "because that location "
                    + "is outside the bounds of the map.");
        }
    }

    private static void assignScenesToLocations(Map map, Scene scene) {
        Location[][] locations = map.getLocations();

        locations[0][1].setScene(Scene.Rue);
        locations[1][0].setScene(Scene.Rue);
        locations[2][0].setScene(Scene.Rue);
        locations[3][0].setScene(Scene.Rue);
        locations[4][0].setScene(Scene.Rue);
        locations[5][0].setScene(Scene.Rue);
        locations[6][0].setScene(Scene.Rue);
        locations[1][1].setScene(Scene.Rue);
        locations[2][1].setScene(Scene.Rue);
        locations[3][1].setScene(Scene.Rue);
        locations[4][1].setScene(Scene.Rue);
        locations[5][1].setScene(Scene.Rue);
        locations[1][2].setScene(Scene.Rue);
        locations[2][2].setScene(Scene.Rue);
        locations[3][2].setScene(Scene.Rue);
        locations[2][3].setScene(Scene.Rue);
        /*
        locations[][].setScene(Scene.Rue);
        locations[][].setScene(Scene.Rue);
        locations[][].setScene(Scene.Rue);
        locations[][].setScene(Scene.Rue);
        locations[][].setScene(Scene.Rue);
        locations[][].setScene(Scene.Rue);*/
    }
}
