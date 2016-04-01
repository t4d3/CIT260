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

    public static void calcTravelTime(Point ALocation, Point BLocation, int timeUsed, int maxTime)
            throws GameControlException {
        boolean pass = true;
        if (timeUsed >= maxTime || timeUsed < 0) {
            pass = false;
        }

        double distSqr = (Math.pow((ALocation.getX() - BLocation.getX()), 2)
                + Math.pow((ALocation.getY() - BLocation.getY()), 2));
        int timeToTravel = (int) Math.sqrt(distSqr); //This is the total Distance (travel time)
        if ((timeToTravel + timeUsed) > maxTime) {
            pass = false;
        }
        if (!pass) {

            throw new GameControlException("Cannot Update Time: "
                    + timeUsed + " is greater than "
                    + maxTime + " after the calculation is made.");
        }
        try {
            GameControl.updateGameTime(timeToTravel);
        } catch (GameControlException e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
