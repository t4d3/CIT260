/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Player;
import java.awt.Point;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        System.out.println("\n*** Create player funciton called***");
        if (playerName == null) {
            return null;
        }
        Player player;
        player = new Player();
        player.setName(playerName);
        ZombieStuff.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        ZombieStuff.setCurrentGame(game);
        game.setPlayer(player);
        
        Item[] inventoryList = GameControl.createInventory();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharacterToStartingLocation(map);
    }

//    public static updateLocation() {
//        call calcTravelTime
//            if there is no error, the update the location
    public static void updateLocation(String locationOption, GameCharacter character) throws GameControlException {
        System.out.println("***UpdateLocation() Called***");
        Point pointB = new Point(0,0);
        Point desiredLocation = new Point();
        Point currentLocation = new Point();
        //get the locatin of the store
        //calculate the travel time to that store;
        //if the travel time is negative, RETURN Error Code
        //Update character's location
        //update total time  try movePlayerView > updateLocation > calcTravelTime throw
        //return total time
        throw new GameControlException("Cannot Update Location"
                + desiredLocation + ", because it's dumb. "
                + "CurrentLocation is " + currentLocation);
    }

    private static Item[] createInventory() {
        System.out.println("** createInventory() called ***");
        Item[] item = {};
        return item;
    }
}
