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
public class Map implements Serializable {
   //class instance variable
    private int column;
    private int row;

    public Map() {
    }

    
    
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.column;
        hash = 97 * hash + this.row;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "column=" + column + ", row=" + row + '}';
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
        final Map other = (Map) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        return true;
    }
    
    
}
