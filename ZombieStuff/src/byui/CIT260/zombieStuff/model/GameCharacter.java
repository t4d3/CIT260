/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Justin Cox
 */
public class GameCharacter implements Serializable {

    private final int attack;
    private final int defence;
    private int health;
    private int floor;
    private String name;
    private final String description;
    private Point currentLocation;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Item> equiped = new ArrayList<>();

    public GameCharacter(int health, int attack, int defence, int floor,
            Point currentLocation, String name, String description) {
        this.name = name;
        this.description = description;
        this.currentLocation = currentLocation;
        this.floor = floor;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.equiped = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Item> getEquiped() {
        return equiped;
    }

    public void setEquiped(ArrayList<Item> equiped) {
        this.equiped = equiped;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setEquiped(Item item) {
        this.equiped.add(item);
    }

    public int getHealth() {
        return health;
    }

    public int getAttackBonus() {
        int weaponBonus = 0;
        for (Item currentWeapon : this.equiped) {
            weaponBonus += currentWeapon.getAttackBonus();
        }
        return weaponBonus;
    }

    public int getDefenceBonus() {
        int defenceBonus = 0;
        for (Item currentWeapon : this.equiped) {
            defenceBonus += currentWeapon.getDefenceBonus();
        }
        return defenceBonus;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void addInventoryItem(Item item) {
        this.inventory.add(item);
    }

    public void setCurrentLocation(Point location) {
        this.currentLocation = location;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }
}
