/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Location;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Scene;

/**
 *
 * @author Justin Cox
 */
public class MapControl {
    public static Map createMap() {
//Quite frankly, I have no idea what this is for.
        Map map = new Map(20,20);

        return map;
    }

    static void moveCharacterToStartingLocation(Map map) {
        System.out.println("** moveCharacterToStartingLocation() called ***");
    }

    private static void assignScenesToLocations(Map map, Scene scene) {
        System.out.println("** assignScenesToLocations() called ***");

        Location[][] locations = map.getLocations();

        locations[0][1].setScene(Scene.Claires);
        locations[0][3].setScene(Scene.OldNavy);
        locations[0][1].setScene(Scene.Zales);
        locations[0][1].setScene(Scene.Nike);
        locations[0][1].setScene(Scene.VictoriasSecret);
        locations[0][1].setScene(Scene.Stairs);
        locations[0][1].setScene(Scene.Stairs);
        locations[0][1].setScene(Scene.Claires);
        locations[0][1].setScene(Scene.Target);

    }
}
