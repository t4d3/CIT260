/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.io.Serializable;

/**
 *
 * @author Justin Cox
 */
public class Game implements Serializable {
    private double timeStarted;
    private double currentScore;

    public Game() {
    }

    
    
    public double getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(double timeStarted) {
        this.timeStarted = timeStarted;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.timeStarted) ^ (Double.doubleToLongBits(this.timeStarted) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "timeStarted=" + timeStarted + ", currentScore=" + currentScore + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timeStarted) != Double.doubleToLongBits(other.timeStarted)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        return true;
    }
    
    
}
