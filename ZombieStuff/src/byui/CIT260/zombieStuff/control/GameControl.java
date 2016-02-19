/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Player;

/**
 *
 * @author Justin Cox
 */
public class GameControl {
    public static Player createPlayer(String playerName) {
        System.out.println("\n*** Create player funciton called***");
        return new Player();
    }
}
