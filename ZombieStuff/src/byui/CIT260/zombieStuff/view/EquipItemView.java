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
            super("***************Help Menu****************"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move" 
                + "\nT - How much time will I have?"
                + "\nF - How to fight"
                + "\nD - Collecting/weilding items"
                + "\nQ - Quit"
                + "\n****************************************");
    }

    @Override
    public boolean doAction(String value) {
        System.out.println("*** Do Actions called***");
        return false;
    }
    
}
