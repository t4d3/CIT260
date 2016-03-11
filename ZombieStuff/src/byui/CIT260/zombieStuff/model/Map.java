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
public class Map implements Serializable {
   //class instance variable
    private int noOfRows;
    private int noOfColumns;
    private int floors;
    private Location[][] locations;
    private Scene scene;
    private ArrayList<GameCharacter> gameCharacter;

    public Map() {
    }
    
    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of Rows and Columns must be > 0");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int floor = 0; floor < floors; floor++) {
            for (int row = 0; row < noOfRows; row++) {
                for (int column = 0; column < noOfColumns; column++) {
                    Location location = new Location();
                    location.setColumn(column);
                    location.setRow(row);
                    location.setVisited(false);
                
                locations[row][column] = location;
                }
            }
        }
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
}
