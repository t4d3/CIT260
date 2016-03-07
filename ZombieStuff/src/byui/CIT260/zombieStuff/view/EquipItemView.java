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
public class EquipItemView extends View{
        public EquipItemView() {
            super("**********************Equip  Item**********************"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n* 0 - Go to a store                                   *"
+ "\n* 0 - Display the Map                                 *"
+ "\n* 0 - Go to the Food Court                            *"
+ "\n* 0 - Look at your Inventory                          *"
+ "\n* 0 - Quit                                            *"
+ "\n*                                                     *"
+ "\n*                                                     *"
+ "\n*******************************************************"
+ "\n\tWhat would you like to do? ");
    }

    @Override
    public boolean doAction(String value) {
        System.out.println("*** Do Actions called***");
        return false;
    }
    
}
