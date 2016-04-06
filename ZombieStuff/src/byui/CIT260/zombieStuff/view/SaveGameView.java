/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;

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
                + "\n* F:\\ServerFiles\\ImportantDocs\\DO_NOT_TOUCH.nsfw      *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\nPlease enter the FULL file path: ");
    }

    @Override
    public boolean doAction(String filePath) {
        if (filePath.length() < 3) {
            ErrorView.display(this.getClass().getName(), "Invalid entry...must be a litte longer.");
            return false;
        }
        try {
            GameControl.saveGame(filePath);
        } catch (GameControlException e) {
            ErrorView.display("GameControl", e.getMessage());
        }
        return true;
    }
}
