/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import byui.CIT260.zombieStuff.model.GameCharacter;
import byui.CIT260.zombieStuff.model.Location;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class FightZombieControl {

    public static void fightAZombie(Location location) throws GameControlException {

        try {
            //get the characters info and sign it to variables
            GameCharacter playerCharacter = ZombieStuff.getCurrentGame().getPlayerCharacter();
            GameCharacter zombie = null;
            int playerAttack = playerCharacter.getAttack() + playerCharacter.getAttackBonus();
            int playerDefence = playerCharacter.getDefence() + playerCharacter.getDefenceBonus();

            for (int i = 0; i < location.getCharactersInThisLocation().size(); i++) {
                if ("A Zombie".equals(location.getCharactersInThisLocation().get(i).getName())) {
                    zombie = location.getCharactersInThisLocation().get(i);
                }
            }

            if (playerCharacter.getHealth() < 1) {
                //error you are dead!
                throw new GameControlException("Player health is too low.");
            } else if (zombie.getHealth() < 1) {
                //zombie is dead
                throw new GameControlException("Zombie is dead.");
            }

            int zombieHealth = zombie.getHealth();
            int playerHealth = playerCharacter.getHealth();

            //check to see the values of playerHealth and zombieHealth
            System.out.println("playerHealth = " + playerHealth + "\nzombieHealth = " + zombieHealth);
            //int playerAttack = playerCharacter.getAttack();
            //int playerDefense = playerCharacter.getDefence();

            //for (int i = 0; i < playerCharacter.getEquiped().size(); i++) {
            while (zombieHealth >= 1) {
                zombieHealth -= playerAttack;
                if (zombieHealth >= 1) {
                    if (zombie.getAttack() - playerDefence > 0) {
                        playerHealth -= zombie.getAttack() - playerDefence;
                    }
                }
            }
            if (playerHealth <= 0) {
                //error you are dead
                throw new GameControlException("You are dead bro.");
            }

            if (playerHealth >= 10)
                    ; else {
                ZombieStuff.getCurrentGame().getPlayerCharacter().setHealth(playerHealth);

            }
            System.out.println("playerHealth = " + playerHealth + "\nzombieHealth = " + zombieHealth);
        } catch (Exception e) {
            throw new GameControlException("You are not able to fight this zombie.");
        }
        //assign variables here

    }

}
