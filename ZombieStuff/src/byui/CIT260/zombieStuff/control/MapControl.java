/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Map;

/**
 *
 * @author Justin Cox
 */
public class MapControl {
    public static Map createMap() {
        Map map = new Map(20,20);

        assignScenesToLocations(map);

        return map;
    }

    static void moveCharacterToStartingLocation(Map map) {
        System.out.println("** moveCharacterToStartingLocation() called ***");
    }

    private static void assignScenesToLocations(Map map) {
        System.out.println("** assignScenesToLocations() called ***");
    }
}
