/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Player;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class GameControl {
    public static Player createPlayer(String playerName) {
        System.out.println("\n*** Create player funciton called***");
        if (playerName == null) { return null; }
        Player player;
        player = new Player();
        player.setName(playerName);
        ZombieStuff.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() called***");
    }
}
