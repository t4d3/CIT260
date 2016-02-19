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
public class MainMenuView {
    private String menu;
    public void MainMenueView() {
        this.menu = "\n*************************************"
                  + "\n         Main Menu"
                  + "N - New game"
                  + "R - Retrieve and resume old game"
                  + "H - Display a Help menu"
                  + "S - Save game"
                  + "Q - Quit";
    }
    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() called***");
        return "N";
    }

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}

