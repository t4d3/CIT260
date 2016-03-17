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
