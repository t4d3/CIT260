/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Justin Cox
 */
public enum GameCharacter implements Serializable {

    Player(10, 3, 0, 1, new Point(0,0), "You might have had too many street tacos"),
    Zombie(5, 2, 0, 1, new Point(2,3), "This is an evil Zombie"),
    Baker(10, 3, 0, 1, new Point(0,0), "He might not exist, but he looks good!"),
    ShopOwner(10, 3, 0, 1, new Point(0,0), "He kinda wears weird cloaths, but that's his thing"),
    HotDogEmployee(1, 70, 10, 1, new Point(0,0), "She looks shifty, but oddly enough, you want to buy her food");

    private final double attack;
    private final double defence;
    private double health;
    private final int floor;
    private final String description;
    private final Point currentLocation;
    private final ArrayList<Item> inventory = new ArrayList<>();

    GameCharacter(int health, int attack, int defence, int floor, Point currentLocation, String description) {
        this.description = description;
        this.currentLocation = currentLocation;
        this.floor = floor;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    
    
    public String getDescription() {
        return description;
    }

    public String setCurrentLocation() {
        return description;
    }
    
    
}
