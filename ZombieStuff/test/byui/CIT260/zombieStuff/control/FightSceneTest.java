/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin Cox
 */
public class FightSceneTest {
    
    public FightSceneTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fightAZombie method, of class FightScene.
     */
    @Test
    public void testFightAZombie() {
        System.out.println("Test 3");
        int currentHealth = 7;
        int armorBonus = 0;
        int weaponBonus = 0;
        FightScene instance = new FightScene();
        int expResult = 5;
        int result = instance.fightAZombie(currentHealth, armorBonus, weaponBonus);
        assertEquals(expResult, result);
        
    }
    
}
