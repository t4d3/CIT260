/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.EatingFood;
import byui.CIT260.zombieStuff.exceptions.GameControlException;

/**
 *
 * @author T4d3-T550
 */
class BuyACornDogView extends View {

    public BuyACornDogView() {
        super("**********************CornDog Time*********************"
                + "\n*            http://pinkandgold.party/                *"
                + "\n*                                                     *"
                + "\n* To buy a corndog, you must enter the number of      *"
                + "\n*   cornDogs that you want to buy, and the amount     *"
                + "\n*   of money you will pay for the cornDogs.           *"
                + "\n*   Don't forget to tip!! (12% - 22% tips accepted)   *"
                + "\n*             -- IMPORTANT INFORMATION --             *"
                + "\n*                CornDogs are 1 $ each                *"
                + "\n*      If you don't need a CornDog, don't but it      *"
                + "\n*******************************************************"
                + "\n\tEnter the number of cornDogs you want: ");
    }

    @Override
    public boolean doAction(String menuOption) {
        int numCornDogs = 0;
        double money = 0;
        try {
            numCornDogs = Integer.parseInt(menuOption);
        } catch (NumberFormatException e) {
            ErrorView.display("InventoryView.getInput", e.getMessage());
        }
        System.out.println("Enter the ammount you will pay (Remmeber tax! ");
        menuOption = this.getInput();
        try {
            money = Double.parseDouble(menuOption);
        } catch (NumberFormatException e) {
            ErrorView.display("InventoryView.getInput", e.getMessage());
        }
        try {
        EatingFood.eatFood(numCornDogs, money);
        } catch (GameControlException e) {
            ErrorView.display("GameControl", e.getMessage());
        }
                return true;
    }

}
