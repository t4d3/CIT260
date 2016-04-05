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

    public static int fightAZombie(Location location) throws GameControlException {

        try {
            ZombieStuff.getCurrentGame().getPlayer();
            double health = ZombieStuff.getCurrentGame().getPlayerCharacter().getHealth();
            
            int zombieHealth = 5;

            if (health < 1) {
                //error you are dead!
                return -1;
            } else if (zombieHealth < 1) {
                //zombie is dead
                return -2;
            }
            while (zombieHealth >= 1) {
                zombieHealth -= 3 + weaponBonus;
                if (zombieHealth >= 1) {
                    health -= (2 - armorBonus);
                }
                if (health <= 0) {
                    //error you are dead
                    return -1;
                }
            }
        } catch (Exception e) {
            throw new GameControlException("You are not able to fight this zombie.");
        }
    }
    return health;
}
