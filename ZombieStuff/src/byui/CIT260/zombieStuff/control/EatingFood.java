/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.control;

/**
 * @author T4d3-T550
 */
public class EatingFood {
    public int eatFood(int healthCurrent, int numCornDogs, float money) {
        if (healthCurrent >= 10) {
            return healthCurrent;
            // ERROR: they have no need for food
        }
        else if (healthCurrent == 0) {
            return -1;
            //ERROR: they are dead
        }
        else if (numCornDogs > (10 - healthCurrent)) {
            return -2;
            //ERROR: too many cornDogs
        }
        else if (numCornDogs < (10 - healthCurrent)) {
            //WARNING: you could have more cornDogs
            //CONTINUE onto the purchase
            return -3;
        }
// the purchase portion of the code
        double maxCostOfCornDogs = (1.75 * numCornDogs)*.22 + (1.75 * numCornDogs);
        double minCostOfCornDogs = (1.75 * numCornDogs)*.12 + (1.75 * numCornDogs);
        if (money > maxCostOfCornDogs) {
            return -4;
            //ERROR: that tip is bogus!
        }
        if (money < minCostOfCornDogs) {
            return -5;
            //ERROR: where's the tip?
        }
	healthCurrent += numCornDogs;
	return healthCurrent;
    }
}