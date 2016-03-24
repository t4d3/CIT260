/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiestuff;

import byui.CIT260.zombieStuff.model.Game;
import byui.CIT260.zombieStuff.model.Player;
import byui.CIT260.zombieStuff.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author T4d3-T550
 */
public class ZombieStuff {
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ZombieStuff.logFile = logFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ZombieStuff.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ZombieStuff.inFile = inFile;
    }

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
        
        try {

        ZombieStuff.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        
        ZombieStuff.outFile = new PrintWriter(System.out, true);
        
        String filePath = "C:\\Users\\Public\\Downloads\\log.txt";
        ZombieStuff.logFile = new PrintWriter(filePath);
        
        //display the banner
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                "\nCause: " + e.getCause() +
                "\nMessage: " + e.getMessage());
        
        e.printStackTrace();
    }
        finally {
            try {
                if (ZombieStuff.inFile != null)
                    ZombieStuff.inFile.close();
                if (ZombieStuff.logFile != null)
                    ZombieStuff.logFile.close();
                if (ZombieStuff.outFile != null)
                    ZombieStuff.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error Closing Files");
                return;
            }
        }
    }
    
}
