/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.MapControlException;
import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Item;
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
        Map map = new Map(7, 5);
        return map;
    }

    public static void assignCharactersToLocations(Map map)
            throws MapControlException {
        GameCharacter[] characters;
        characters = ZombieStuff.getCurrentGame().getGameCharacters();

        for (GameCharacter character : characters) {
            Point coordinates = character.getCurrentLocation();
            MapControl.moveCharacterToStartingLocation(character, coordinates);

        }
    }

    public static void moveCharacterToStartingLocation(GameCharacter character, Point coordinates)
            throws MapControlException {
        Map map = ZombieStuff.getCurrentGame().getMap();
        int newColumn = coordinates.x;
        int newRow = coordinates.y;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move character to location "
                    + coordinates.x + ", " + coordinates.y + "because that location "
                    + "is outside the bounds of the map.");
        }
        //problem
        ZombieStuff.getCurrentGame().getMap().getLocation(newColumn, newRow).setCharacterToLocation(character);

    }

    public static void assignScenesToLocations() {

        ZombieStuff.getCurrentGame().getMap().getLocation(0, 0).setScene(Scene.Target);
        ZombieStuff.getCurrentGame().getMap().getLocation(0, 1).setScene(Scene.Target);
        ZombieStuff.getCurrentGame().getMap().getLocation(0, 2).setScene(Scene.Target);
        ZombieStuff.getCurrentGame().getMap().getLocation(0, 3).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(0, 4).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(1, 0).setScene(Scene.GameStop);
        ZombieStuff.getCurrentGame().getMap().getLocation(1, 1).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(1, 2).setScene(Scene.Zumies);
        ZombieStuff.getCurrentGame().getMap().getLocation(1, 3).setScene(Scene.FoodCourt);
        ZombieStuff.getCurrentGame().getMap().getLocation(1, 4).setScene(Scene.VictoriasSecret);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 0).setScene(Scene.GameStop);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 1).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 2).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 3).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 4).setScene(Scene.VictoriasSecret);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 0).setScene(Scene.JCPenney);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 1).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 2).setScene(Scene.Nike);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 3).setScene(Scene.OldNavy);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 4).setScene(Scene.VictoriasSecret);
        ZombieStuff.getCurrentGame().getMap().getLocation(4, 0).setScene(Scene.Kay);
        ZombieStuff.getCurrentGame().getMap().getLocation(4, 1).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(4, 2).setScene(Scene.Lids);
        ZombieStuff.getCurrentGame().getMap().getLocation(4, 3).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(4, 4).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 0).setScene(Scene.Kay);
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 1).setScene(Scene.Hall);
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 2).setScene(Scene.Rue);
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 3).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 4).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 0).setScene(Scene.Claires);
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 1).setScene(Scene.Claires);
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 2).setScene(Scene.Claires);
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 3).setScene(Scene.Outside);//null
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 4).setScene(Scene.Outside);//null
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
        + "\n|           |Zumies  I   I  Nike  | Lids   |Rue 21  |           |"
        + "\n|    02     |_____12_| 22|_____32_|_____42_|_____52_|      62   |"
        + "\n|  Target   I                                       I  Claire's |"
        + "\n|    01     |_____11___21______31_______41_______51_|      61   |"
        + "\n|           |  GameStop  |  JCPenney  |Kay Jewelers |           |"
        + "\n|____00_____|_____10___20|_____30_____|_40_______50_|______60___|"
        + "\n\tWhat would you like to do? ");*/
    static void assignItemsToLocations() {
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 1).addItemToLocation(Item.Dress);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 2).addItemToLocation(Item.Shoes);
        ZombieStuff.getCurrentGame().getMap().getLocation(0, 1).addItemToLocation(Item.Hammer);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 0).addItemToLocation(Item.Toothbrush);
        ZombieStuff.getCurrentGame().getMap().getLocation(5, 2).addItemToLocation(Item.Hanger);
        ZombieStuff.getCurrentGame().getMap().getLocation(6, 1).addItemToLocation(Item.Shirt);
        ZombieStuff.getCurrentGame().getMap().getLocation(2, 4).addItemToLocation(Item.Armor);
        ZombieStuff.getCurrentGame().getMap().getLocation(3, 1).addItemToLocation(Item.Toothpick);
    }

}
