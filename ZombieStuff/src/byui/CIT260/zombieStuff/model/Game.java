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
    private int totalTime;
    private double currentScore;
    private Item[] inventory;
    private Player player;
    private String[] actors;
    private Map map;

    public Game() {
    }

    
    
    public int getTimeStarted() {
        return totalTime;
    }

    public void setTimeStarted(int totalTime) {
        this.totalTime = totalTime;
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
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", currentScore=" + currentScore + '}';
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
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        return true;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
}
