/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("*******************************************************"
                + "\n*                                                     *"
                + "\n* Okay, here we go now...                             *"
                + "\n*   You must enter the full file path of where you    *"
                + "\n* want to save the game.                              *"
                + "\n*        Examples:                                    *"
                + "\n* C:\\Users\\your_User_Name\\Desktop\\myGame              *"
                + "\n* C:\\Windows\\System32\\config.dat                      *"
                + "\n* C:\\Users\\Public\\Documents\\ZombieGame.iso            *"
                + "\n* F:\\ServerFiles\\ImportantDocs\\DO_NOT_TOUCH.nsfw      *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\nPlease enter the FULL file path: ");
    }

    @Override
    public boolean doAction(String filePath) {
        if (filePath.length() < 3) {
            ErrorView.display(this.getClass().getName(),"Invalid entry...must be a litte longer.");
            return false;
        }
        System.out.println("starting the try statment...");
        try {
            GameControl.saveGame(filePath);
        } catch (GameControlException e) {
            ErrorView.display("GameControl", e.getMessage());
        }
        return true;
    }
}
