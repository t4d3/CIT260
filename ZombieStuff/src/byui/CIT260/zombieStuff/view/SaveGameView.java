/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author T4d3-T550
 */
public class SaveGameView extends View{
    public SaveGameView() {
        super("*******************************************************"
+ "\n*                                                     *"
+ "\n* Okay, here we go now...                             *"
+ "\n*   You must enter the full file path of where you    *"
+ "\n* want to save the game.                              *"
+ "\n*        Examples:                                    *"
+ "\n* C:/Users/your_User_Name/Desktop/myGame              *"
+ "\n* C:/Windows/System32/config.dat                      *"
+ "\n* C:/Users/Public/Documents/ZombieGame.iso            *"
+ "\n* F:/ServerFiles/ImportantDocs/DO_NOT_TOUCH.nsfw      *"
+ "\n*                                                     *"
+ "\n*******************************************************"
        +"\nPlease enter the FULL file path: ");
    }

    @Override
    public boolean doAction(String filePath) {
        if (filePath.length() < 3) {
            System.out.println("Invalid entry...must be a litte longer.");
            return false;
        }
        System.out.println("It got this far!");
//this is where the try file stuff goes

        return true;
    }
}
