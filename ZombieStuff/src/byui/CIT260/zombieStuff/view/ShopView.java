/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Location;
import java.util.ArrayList;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class ShopView extends View {

    public ShopView() {
        super("ERROR: This view was not called properly!\n\tPess Q to return.");
        displayMessage = this.getDisplayBlockMessage();
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());
        ArrayList<GameCharacter> charactersInThisLocation = location.getCharactersInThisLocation();
        for (int i = 0; i < charactersInThisLocation.size(); i++) {
            if ("A Zombie".equals(charactersInThisLocation.get(i).getName())) {
                this.fightZombie();
            }
        }

    }

    @Override
    public boolean doAction(String value) {
        return true;
    }

    private String getDisplayBlockMessage() {
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());

        String displayBlock = "***********************Shopping!***********************";
        displayBlock += "\n* Your are currently in " + location.getName() + "."
                + "\n* " + location.getDescription()
                + "\n* People in this location: You; ";
        for (int i = 0; i < location.getCharactersInThisLocation().size(); i++) {
            displayBlock += location.getCharactersInThisLocation().get(i).getName() + "; ";
        }
        displayBlock += "\n* Items in this location: ";
        for (int i = 0; i < location.getItemsInThisLocation().size(); i++) {
            displayBlock += location.getItemsInThisLocation().get(i) + "; ";
        }
        displayBlock += "\n*                                                     *"
                + "\n* P - Pick up Item                                    *"
                + "\n* D - drop Item from your inventory                   *"
                + "\n* Q - Quit back to main menu                          *"
                + "\n*                                                     *";
        return displayBlock;
    }

    private void fightZombie() {
        FightZombieView fightZombieView = new FightZombieView();
        fightZombieView.display();
    }

}
