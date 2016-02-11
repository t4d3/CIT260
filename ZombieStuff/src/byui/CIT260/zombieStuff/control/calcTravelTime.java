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
    public int calcTravelTime(Point ALocation, Point BLocation, int timeUsed, int maxTime) {
        if (timeUsed >= maxTime ) {
            return -2;
            //ERROR: You are out of time!
        }
        else if (timeUsed < 0) {
            return -1;
            //ERROR: you cannot be negative time!
        }
        double distSqr = (Math.pow((ALocation.getX() - BLocation.getX()), 2)
                         + Math.pow((ALocation.getY() - BLocation.getY()), 2));
        return (int) Math.sqrt(distSqr); //This is the total Distance (travel time)
    }
}
