/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

import java.awt.Point;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T4d3-T550
 */
public class calcTravelTimeTest {
    
    public calcTravelTimeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTravelTime method, of class calcTravelTime.
     */
    @Test
    public void testCalcTravelTime() {
        System.out.println("calcTravelTime");
        System.out.println("Test Case No: 5");
        Point ALocation = new Point(1,1);
        Point BLocation = new Point(3,2);
        int timeUsed = 9;
        int maxTime = 120;
        CalcTravelTime instance = new CalcTravelTime();
        int expResult = 2;
        int result = instance.calcTravelTime(ALocation, BLocation, timeUsed, maxTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
