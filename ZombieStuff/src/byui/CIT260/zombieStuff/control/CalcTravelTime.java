/*
 * This code should only return the time between two points, so that the calling
 *  function can either warn the player of the travel time, or assign the travel
 *  time to the timeUsed.  Either return the time used, or false?
 *  If the return is a positive number, then the location change worked!
 */
package byui.CIT260.zombieStuff.control;

import byui.CIT260.zombieStuff.exceptions.GameControlException;
import java.awt.Point;

/**
 *
 * @author T4d3-T550
 */
public class CalcTravelTime {
    public CalcTravelTime() {
    }
//    public calcTravelTime() {
//       if there is an error, this will go back to the movePlayerView()
    public int calcTravelTime(Point ALocation, Point BLocation, int timeUsed, int maxTime) throws GameControlException {
        boolean pass = true;
        if (timeUsed >= maxTime ) {
            pass = false;
            //ERROR: You are out of time!
        }
        else if (timeUsed < 0) {
            pass = false;
            //ERROR: you cannot be negative time!
        }
        if (pass)
            throw new GameControlException("Cannot Update Time: "
                + timeUsed + " is greater than "
                + maxTime + " after the calculation is made.");

        double distSqr = (Math.pow((ALocation.getX() - BLocation.getX()), 2)
                         + Math.pow((ALocation.getY() - BLocation.getY()), 2));
        int timeToTravel = (int) Math.sqrt(distSqr); //This is the total Distance (travel time)
        if ((timeToTravel + timeUsed) > maxTime) {
            return -3;
        }
        return timeToTravel;
   }
}
