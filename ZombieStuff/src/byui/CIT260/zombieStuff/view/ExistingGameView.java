/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.GameControl;

/**
 *
 * @author T4d3-T550
 */
class ExistingGameView extends View {

    ExistingGameView() {
        super("*******************************************************"
                + "\n*                                                     *"
                + "\n* Alrighty, let's do this...                         *"
                + "\n*   You must enter the full file path of where the    *"
                + "\n* existing game is saved.                             *"
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
            System.out.println("Invalid entry...must be a litte longer.");
            return false;
        }
        try {
            GameControl.retrieveGame(filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        return true;
    }

}
