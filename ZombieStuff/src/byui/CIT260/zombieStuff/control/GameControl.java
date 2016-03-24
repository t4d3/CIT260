/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.exceptions.MapControlException;
import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.Item;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Player;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

    public static void createNewGame(Player player)
            throws MapControlException {
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
    public static void updateGameTime(int desiredTravelTime) {
        System.out.println("***updateGameTime() Called***");
        ZombieStuff.getCurrentGame().setTotalTime(ZombieStuff.getCurrentGame().getTotalTime() + desiredTravelTime);
    }

    public static void updateLocation(Point desiredLocation)
            throws GameControlException {
        System.out.println("***UpdateLocation() Called***");
        
        //calculate the travel time to that store;
        //if the travel time is negative, RETURN Error Code
        //Update character's location
        //update total time  try movePlayerView > updateLocation > calcTravelTime > updateGameTime throw
        //return total time
        if (false)
            throw new GameControlException("Cannot Update Location"
                + desiredLocation + ", because it's dumb. "
                + "CurrentLocation is unchanged");
    }

    private static Item[] createInventory() {
        System.out.println("** createInventory() called ***");
        Item[] item = {};
        return item;
    }
    
    public static void saveGame(String filePath) throws GameControlException {
                try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(ZombieStuff.getCurrentGame());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

    }
}
