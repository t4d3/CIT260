/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.model.Location;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class ShopView extends View {

    public ShopView() {
        super("ERROR: This view was not called properly!\n\tPess Q to return.");
        displayMessage = this.getDisplayBlockMessage();

    }

    @Override
    public boolean doAction(String value) {
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());
        return true;
    }

    private String getDisplayBlockMessage() {
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());

        String displayBlock = "Your are currently in " + location.getName() + ".";
        displayBlock += "\n" + location.getDescription() + "\nPeople in this location: You; ";
        for (int i = 0; i < location.getCharactersInThisLocation().size(); i++) {
            displayBlock += location.getCharactersInThisLocation().get(i).getName() + "; ";
        }
        displayBlock += "\nItems in this location: ";
        for (int i = 0; i < location.getItemsInThisLocation().size(); i++) {
            displayBlock += location.getItemsInThisLocation().get(i) + "; ";
        }

        return displayBlock;
    }

}
