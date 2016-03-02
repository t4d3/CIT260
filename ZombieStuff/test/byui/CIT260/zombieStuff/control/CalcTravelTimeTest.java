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
import byui.CIT260.zombieStuff.control.CalcTravelTime;

/**
 *
 * @author T4d3-T550
 */
public class CalcTravelTimeTest {
    
    public CalcTravelTimeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTravelTime method, of class CalcTravelTime.
     */
    @Test
    public void testCalcTravelTime0() {
        System.out.println("calcTravelTime");
        Point ALocation = new Point(1,2);
        Point BLocation = new Point(2,3);
        int timeUsed = 30;
        int maxTime = 120;
        CalcTravelTime instance = new CalcTravelTime();
        int expResult = 2;
        int result = instance.calcTravelTime(ALocation, BLocation, timeUsed, maxTime);
        assertEquals(expResult, result);
    }
}
