/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Justin Cox
 */
public enum GameCharacter implements Serializable {

    Player("This is an evil Zombie", new Point(0,0)),
    Zombie("This is an evil Zombie", new Point(2,3)),
    Baker("He might not exist, but he looks good!", new Point(2,3)),
    ShopOwner("He kinda wears weird cloaths, but that's his thing", new Point(2,3)),
    HotDogOnAStickEmployee("She looks shifty, but oddly enough, you want to buy her food", new Point(2,3));

    private final String description;
    
    private final Point currentLocation;

    GameCharacter(String description, Point currentLocation) {
        this.description = description;
        this.currentLocation = currentLocation;
    }

    
    
    public String getDescription() {
        return description;
    }}
