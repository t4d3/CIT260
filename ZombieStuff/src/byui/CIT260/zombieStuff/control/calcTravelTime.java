/*
 * This code should only return the time between two points, so that the calling
 *  function can either warn the player of the travel time, or assign the travel
 *  time to the timeUsed.  Either return the time used, or false?
 *  If the return is a positive number, then the location change worked!
 */
package byui.CIT260.zombieStuff.control;

import java.awt.Point;

/**
 *
 * @author T4d3-T550
 */
public class calcTravelTime {
    public int calcTravelTime(Point ALocation, Point bLocation, int timeUsed, int maxTime) {
        if (timeUsed >= maxTime ) {
            return maxTime;
            //ERROR: You are out of time!
        }
        else if (timeUsed < 0) {
            return -1;
            //ERROR: you cannot be negative time!
        }
        else if (0 <= timeUsed && timeUsed < maxTime) {
            //Continue onto program
        }
        
    }
}
