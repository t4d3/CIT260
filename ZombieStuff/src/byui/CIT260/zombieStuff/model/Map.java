/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Justin Cox
 */
public class Map implements Serializable {
   //class instance variable
    public Map(int a, int b) {
    }

    private final String name[] = {"Zumies", "Old Navy", "Zales", "Nike"};
    private final Point location[][] = {
        {
            new Point(0,0),
            new Point(0,1),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
        },
        {
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,0),
            new Point(0,26),
        }
    };

}
