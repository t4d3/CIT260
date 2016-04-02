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
        if (this.zombieTest()) {
            System.out.println("shopView should be exited if this is displayed.");
        }
        System.out.println("It got here, and needs to continue the shopView.");

    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption) {
            case "P":
                this.pickUpItem();
                this.getDisplayBlockMessage();
                break;
            case "D":
                this.dropItem();
                this.getDisplayBlockMessage();
                break;
        }
        displayMessage = this.getDisplayBlockMessage();
        return false;
    }

    private boolean zombieTest() {
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());
        ArrayList<GameCharacter> charactersInThisLocation = location.getCharactersInThisLocation();
        for (int i = 0; i < charactersInThisLocation.size(); i++) {
            if ("A Zombie".equals(charactersInThisLocation.get(i).getName())) {
                this.fightZombie();
                return true;
            }
        }
        return false;
    }

    private String getDisplayBlockMessage() {
        Location location = ZombieStuff.getCurrentGame().getMap().getLocation(
                ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation());

        String displayBlock = "***********************Shopping!***********************";
        displayBlock += "\n* Your are currently in " + location.getName() + "."
                + "\n* " + location.getDescription() + "\n*"
                + "\n* People in this location: ";
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
                + "\n*******************************************************"
                + "\n\tWhat would you like to do? ";

        return displayBlock;
    }

    private void dropItem() {
        DropItemView dropItemView = new DropItemView();
        dropItemView.display();
    }

    private void fightZombie() {
        FightZombieView fightZombieView = new FightZombieView();
        fightZombieView.display();
    }

    private void pickUpItem() {
        PickUpItemView pickUpItemView = new PickUpItemView();
        pickUpItemView.display();
    }
}
