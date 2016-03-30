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

    public Map(int noOfColumns, int noOfRows) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of Rows and Columns must be > 0");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        this.floors = 1;
        this.locations = new Location[noOfColumns][noOfRows];

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                locations[column][row] = location;
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

    public Location getLocation(int column, int row) {
        return this.locations[column][row];
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Scene getScene() {
        return scene;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

}
