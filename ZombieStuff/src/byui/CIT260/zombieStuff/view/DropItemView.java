/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author T4d3-T550
 */
public class DropItemView extends View{
    public DropItemView() {
        super("**********************Delete Item**********************"
+ "\n*                                                     *"
+ "\n* This is where we'd do like a:                       *"
+ "\n*    if(itemExists) display                           *"
+ "\n* A - type thing, to see the inventory!               *"
+ "\n* B - if there is no item, it'd be blank              *"
+ "\n* C -if there is an item, then it would display a list*"
+ "\n* D - a MAXIMUM of the max number of items in an inv. *"
+ "\n* Q - Quit                                            *"
+ "\n*                                                     *"
+ "\n*******************************************************"
+ "\n\tWhich item would you like to remove? "
        );
                }
    @Override
    public boolean doAction(String value) {
        System.out.println("Howdy.... Do action called");
        return false;
    }
}

        
