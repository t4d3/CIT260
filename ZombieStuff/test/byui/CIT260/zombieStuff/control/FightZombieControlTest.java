/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.model.Location;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin Cox
 */
public class FightZombieControlTest {
    
    public FightZombieControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fightAZombie method, of class FightZombieControl.
     */
    @Test
    public void testFightAZombie() {
        int currentHealth = 7;
        int armorBonus = 0;
        int weaponBonus = 0;
        FightZombieControl instance = new FightZombieControl();
        int expResult = 5;
//        int result = instance.fightAZombie(new Location());
  //      assertEquals(expResult, result);
        
    }
    
}
