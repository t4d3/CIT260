/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Justin Cox
 */
public class Game implements Serializable {

    private int maxTime;
    private int usedTime;
    private Item[] inventory;
    private Player player;
    private GameCharacter playerCharacter;
    private GameCharacter[] gameCharacters;
    private Map map;

    public Game() {
    }

    public int getMaxTime() {
        return maxTime;
    }

    public ArrayList<Item> getPlayerCharacterInventory() {
        return playerCharacter.getInventory();
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.maxTime) ^ (Double.doubleToLongBits(this.maxTime) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.usedTime) ^ (Double.doubleToLongBits(this.usedTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "maxTime=" + maxTime + ", usedTime=" + usedTime + '}';
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
        if (Double.doubleToLongBits(this.maxTime) != Double.doubleToLongBits(other.maxTime)) {
            return false;
        }
        return Double.doubleToLongBits(this.usedTime) == Double.doubleToLongBits(other.usedTime);
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

    public GameCharacter[] getGameCharacters() {
        return gameCharacters;
    }

    public void setGameCharacters(GameCharacter[] gameCharacters) {
        this.gameCharacters = gameCharacters;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public GameCharacter getPlayerCharacter() {
        return gameCharacters[0];
    }

    public void setPlayerCharacter(GameCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }
}
