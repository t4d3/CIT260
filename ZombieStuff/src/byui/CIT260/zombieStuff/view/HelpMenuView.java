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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("");
        this.displayMessage = this.getHelpMenu(
                "***********************Help Menu***********************"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption) {
            case "G":
                this.displayMessage = this.getHelpMenu(
                        "***********************Help Menu***********************"
                        + "\n* The goal is to make it out of the mall with three   *"
                        + "\n*  items.                                             *"
                        + "\n*                                                     *");
                break;
            case "M":
                this.displayMessage = this.getHelpMenu(
                        "***********************Help Menu***********************"
                        + "\n* You move, by viewing the map, and selecting the     *"
                        + "\n*  desired location                                   *"
                        + "\n*                                                     *");
                break;
            case "T":
                this.displayMessage = this.getHelpMenu(
                        "***********************Help Menu***********************"
                        + "\n* Time increases with every movement. you will have   *"
                        + "\n*  about 30 minutes to complete the goal.             *"
                        + "\n*                                                     *");
                break;
            case "F":
                this.displayMessage = this.getHelpMenu(
                        "***********************Help Menu***********************"
                        + "\n* Fighting is pretty simple... When you want to fight *"
                        + "\n*  press \"F\", and you will be told what the damage  *"
                        + "\n*  was in the end.                                    *");
                break;
            case "I":
                this.displayMessage = this.getHelpMenu(
                        "***********************Help Menu***********************"
                        + "\n* Some stores have items, to take.  You do this by    *"
                        + "\n*  looking into the store, and taking the item you    *"
                        + "\n*  want.                                              *");
                break;
            default:
                System.out.println(
                        "***********************Help Menu***********************"
                        + "\n*                                                     *"
                        + "\n* ERROR: Invalid selection... Try again!              *"
                        + "\n*                                                     *");
                break;
        }
        return false;
    }

    private String getHelpMenu(String headder) {
        String footer = "\n* G - What is the goal of the game?                   *"
                + "\n* M - How to move                                     *"
                + "\n* T - How much time will I have?                      *"
                + "\n* F - How to fight                                    *"
                + "\n* I - Collecting/Weilding items                       *"
                + "\n* Q - Quit                                            *"
                + "\n*******************************************************"
                + "\n\tWhat would you like help with? ";
        return headder + footer;
    }

}
