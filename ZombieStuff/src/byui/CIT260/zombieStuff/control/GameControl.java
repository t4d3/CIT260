/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.GameCharacter;
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
        System.out.println("\n*** createNewGame() called***");
    }

    public static int updateLocation(String locationOption, GameCharacter character) {
        System.out.println("***UpdateLocation() Called***");
        Point pointB = new Point(0,0);
        //get the locatin of the store
        //calculate the travel time to that store;
        //if the travel time is negative, RETURN Error Code
        //Update character's location
        //update total time
        //return total time

        return 0;
        /*        switch (locationOption) {
        case "A":
        pointB.setLocation(0, 0);
        break;
        case "B":
        pointB.setLocation(0, 1);
        break;
        case "C":
        pointB.setLocation(0, 2);
        break;
        case "D":
        pointB.setLocation(0, 0);
        break;
        case "E":
        pointB.setLocation(0, 0);
        break;
        case "F":
        pointB.setLocation(0, 0);
        break;
        case "G":
        pointB.setLocation(0, 0);
        break;
        case "H":
        this.displayHelpMenu();
        break;
        case "I":
        pointB.setLocation(0, 0);
        break;
        case "J":
        pointB.setLocation(0, 0);
        break;
        case "K":
        pointB.setLocation(0, 0);
        break;
        case "L":
        pointB.setLocation(0, 0);
        break;
        case "M":
        pointB.setLocation(0, 0);
        break;
        case "N":
        pointB.setLocation(0, 0);
        break;
        case "O":
        this.displayHelpMenu();
        break;
        case "P":
        pointB.setLocation(0, 0);
        break;
        case "Q":
        break;
        case "R":
        pointB.setLocation(0, 0);
        break;
        case "S":
        pointB.setLocation(0, 0);
        break;
        case "T":
        pointB.setLocation(0, 0);
        break;
        case "U":
        pointB.setLocation(0, 0);
        break;
        case "V":
        pointB.setLocation(0, 0);
        break;
        case "W":
        pointB.setLocation(0, 0);
        break;
        case "X":
        pointB.setLocation(0, 0);
        break;
        case "Y":
        pointB.setLocation(0, 0);
        break;
        case "Z":
        pointB.setLocation(0, 0);
        break;
        default:
        System.out.println("\nERROR: Invalid selection... Try again!");
        break;
        }
        return pointB;*/
    }
}
