/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

/**
 *
 * @author Justin Cox
 */
public class FightScene {
    public int fightAZombie(int currentHealth, int armorBonus, int weaponBonus) {
        
        int zombieHealth = 5;
        
        if(currentHealth < 1){
            //error you are dead!
            return -1;
        }
        else if(zombieHealth < 1){
            //zombie is dead
            return -2;
        }
        while(zombieHealth >= 1){
            zombieHealth -= 3 + weaponBonus;
            if(zombieHealth >= 1){
                currentHealth -= (2 - armorBonus);
            }
            if(currentHealth <= 0) {
                //error you are dead
                return -1;
            }
        }
        
        return currentHealth;
    }
    
}
