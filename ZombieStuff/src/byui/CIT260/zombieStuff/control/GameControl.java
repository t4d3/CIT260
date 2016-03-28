/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.Item;
import byui.CIT260.zombieStuff.model.Map;
import byui.CIT260.zombieStuff.model.Player;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playerName);
        ZombieStuff.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) throws GameControlException {
        try {
            Game game = new Game();

            ZombieStuff.setCurrentGame(game);
            game.setPlayer(player);

            Item[] inventoryList = GameControl.createInventory();
            game.setInventory(inventoryList);

            Map map = MapControl.createMap();
            game.setMap(map);
            System.out.println("this far1");
            MapControl.moveCharacterToStartingLocation(map);
        } catch (Exception e) {
            System.out.println("this far2");
            throw new GameControlException(e.getMessage());
        }
        System.out.println("this far 3");
    }
    //    public static updateLocation() {
    //        call calcTravelTime
    //            if there is no error, the update the location

    public static void updateGameTime(int desiredTravelTime) {
        ZombieStuff.getCurrentGame().setTotalTime(ZombieStuff.getCurrentGame().getTotalTime() + desiredTravelTime);
    }

    public static void updateLocation(Point desiredLocation)
            throws GameControlException {

        //calculate the travel time to that store;
        //if the travel time is negative, RETURN Error Code
        //Update character's location
        //update total time  try movePlayerView > updateLocation > calcTravelTime > updateGameTime throw
        //return total time
        if (false) {
            throw new GameControlException("Cannot Update Location"
                    + desiredLocation + ", because it's dumb. "
                    + "CurrentLocation is unchanged");
        }
    }

    private static Item[] createInventory() {
        Item[] item = {};
        return item;
    }

    public static void saveGame(String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(ZombieStuff.getCurrentGame());
            output.writeObject(ZombieStuff.getPlayer());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void retrieveGame(String filePath) throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());

        }

        ZombieStuff.setCurrentGame(game);

    }

    //this will write a list of all the items to a file the user chooses.
    public static void saveItems(String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            //ArrayList<item> = new item[] or whatever...
            //output("super awesome header, for columns.
            //for(int i = 0; i <= items.getSize(); i++) {
            //    output(super awesome code for formating);
            //}
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
