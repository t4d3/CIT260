/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Justin Cox
 */
public class Location implements Serializable {

    //variables
    private int row;
    private int column;
    private int floor;
    private boolean visited;
    private String description;
    private String name;
    private Scene scene;
    private ArrayList<GameCharacter> charactersInThisLocation;
    private ArrayList<Item> itemsInThisLocation;
    
    public Location() {
        this.charactersInThisLocation = new ArrayList<>();
        this.itemsInThisLocation = new ArrayList<>();
    }
    
    public ArrayList<GameCharacter> getCharactersInThisLocation() {
        return charactersInThisLocation;
    }
    
    public void setCharactersInThisLocation(ArrayList<GameCharacter> charactersInThisLocation) {
        this.charactersInThisLocation = charactersInThisLocation;
    }
    
    public void setCharacterToLocation(GameCharacter character) {
        this.charactersInThisLocation.add(character);
    }
    
    public ArrayList<Item> getItemsInThisLocation() {
        return itemsInThisLocation;
    }
    
    public void setItemsInThisLocation(ArrayList<Item> itemsInThisLocation) {
        this.itemsInThisLocation = itemsInThisLocation;
    }
    
    public void addItemToLocation(Item item) {
        this.itemsInThisLocation.add(item);
    }
    
    public void getItemFromLocation(Item item) {
        this.itemsInThisLocation.remove(item);
    }
    
    public int getRow() {
        return row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    public boolean getIsVisited() {
        return visited;
    }
    
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Scene getScene() {
        return scene;
    }
    
    public void setScene(Scene scene) {
        this.scene = scene;
        this.name = scene.getName();
        this.description = scene.getDescription();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.row;
        hash = 23 * hash + this.column;
        hash = 23 * hash + (this.visited ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    public Item getItemFromLocation(int itemIndex) {
        return itemsInThisLocation.get(itemIndex);
    }
    public Item removeItemFromLocation(int itemIndex) {
        return itemsInThisLocation.remove(itemIndex);
    }
}
