/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiestuff;

import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.Player;
import byui.CIT260.zombieStuff.view.StartProgramView;


/**
 *
 * @author T4d3-T550
 */
public class ZombieStuff {
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieStuff.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieStuff.player = player;
    }
    
    public static void main(String[] args) {

        
        //display the banner
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
         
    }
    
}
