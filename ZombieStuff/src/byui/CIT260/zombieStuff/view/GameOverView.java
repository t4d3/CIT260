/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author Justin Cox
 */
public class GameOverView extends View {

    public GameOverView() {
        super(
                "\n***********************************************************************************"
                + "\n* _______  _______  __   __  _______    _______  __   __  _______  ______    __    *"
                + "\n* |       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  |  *"
                + "\n* |    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  |  *"
                + "\n* |   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  |  *"
                + "\n* |   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__|  *"
                + "\n* |   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __   *"
                + "\n* |_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__|  *"
                + "\n*                                                                                  *"
                + "\n*                       You either died or ran out of time...                      *"
                + "\n*                                                                                  *"
                + "\n*                           BETTER LUCK NEXT TIME!                                 *"
                + "\n************************************************************************************");

    }

    public void EndGame() {
        System.exit(0);
    }

    @Override
    public boolean doAction(String value) {

        return false;
    }
}
