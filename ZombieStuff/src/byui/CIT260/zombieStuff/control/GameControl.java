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

    public static Player createPlayer(String playerName) throws GameControlException {
        if (playerName == null) {
            return null;
        }
        try {
            Player player = new Player();
            player.setName(playerName);
            ZombieStuff.setPlayer(player);
            return player;
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static GameCharacter[] createGameCharacters() {
        GameCharacter[] gameCharacters = new GameCharacter[8];

        GameCharacter player = new GameCharacter(10, 3, 0, 1, new Point(2, 1), ZombieStuff.getPlayer().getName(), "You might have had too many street tacos");
        GameCharacter hotDogEmployee = new GameCharacter(1, 70, 10, 1, new Point(1, 3), "Kyndra", "She looks shifty, but oddly enough, you want to buy her food");
        GameCharacter baker = new GameCharacter(10, 3, 0, 1, new Point(3, 2), "Pierre", "He might not exist, but he looks good!");
        GameCharacter shopOwner = new GameCharacter(10, 3, 0, 1, new Point(4, 2), "Sam", "He kinda wears weird cloaths, but that's his thing");
        GameCharacter zombie = new GameCharacter(5, 2, 0, 1, new Point(3, 3), "the undead", "This is an evil Zombie");
        GameCharacter zombie1 = new GameCharacter(5, 2, 0, 1, new Point(0, 1), "the undead", "This is an evil Zombie");
        GameCharacter zombie2 = new GameCharacter(5, 2, 0, 1, new Point(6, 1), "the undead", "This is an evil Zombie");
        GameCharacter zombie3 = new GameCharacter(5, 2, 0, 1, new Point(4, 2), "the undead", "This is an evil Zombie");

        gameCharacters[0] = player;
        gameCharacters[1] = hotDogEmployee;
        gameCharacters[2] = baker;
        gameCharacters[3] = shopOwner;
        gameCharacters[4] = zombie;
        gameCharacters[5] = zombie1;
        gameCharacters[6] = zombie2;
        gameCharacters[7] = zombie3;

        return gameCharacters;
    }

    public static void createNewGame(Player player) throws GameControlException {
        try {
            Game game = new Game();

            ZombieStuff.setCurrentGame(game);

            game.setPlayer(player);
            GameCharacter[] characters = GameControl.createGameCharacters();

            game.setGameCharacters(characters);
            game.setPlayerCharacter(characters[0]);
            game.setMaxTime(60);
            game.setUsedTime(1);
//this block might be taken out....  it's creating an inventory for the game, which isn't doing anything.
            Item[] inventoryList = GameControl.createInventory();
            game.setInventory(inventoryList);
//mmkay?
            Map map = MapControl.createMap();
            game.setMap(map);

            MapControl.assignScenesToLocations();

            MapControl.moveCharacterToStartingLocation(map);

            ZombieStuff.setCurrentGame(game);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void updateGameTime(int desiredTravelTime) throws GameControlException {
        ZombieStuff.getCurrentGame().setUsedTime(ZombieStuff.getCurrentGame().getUsedTime() + desiredTravelTime);
    }

    public static void updateLocation(Point desiredLocation)
            throws GameControlException {
        try {
//This "Visited" one is redundant, but it's just in case we missed something.
            ZombieStuff.getCurrentGame().getMap().getLocation(
                    ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation()).setVisited(true);
//if this fails, that is chill
            CalcTravelTime.calcTravelTime(ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation(), desiredLocation,
                    ZombieStuff.getCurrentGame().getUsedTime(), ZombieStuff.getCurrentGame().getMaxTime());
//if this fails, that is not chill
            ZombieStuff.getCurrentGame().getPlayerCharacter().setCurrentLocation(desiredLocation);
//setting the "visited" variable as true
            ZombieStuff.getCurrentGame().getMap().getLocation(desiredLocation).setVisited(true);
        } catch (GameControlException e) {
            throw new GameControlException("Cannot Update Location"
                    + desiredLocation + ", because it's dumb. "
                    + "CurrentLocation is unchanged");
        }
        //calculate the travel time to that store;
        //Update character's location
        //update total time  try movePlayerView > updateLocation > calcTravelTime > updateGameTime throw
    }

//this is probably going out the window
    private static Item[] createInventory() {
        Item[] item = new Item[4];
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
