/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import java.util.Scanner;

/**
 *
 * @author Justin Cox
 */
public class FoodMenuView extends View {
    
    public FoodMenuView(){
        super ("*******************************************************"
+ "\n*               FEELING HUNGRY ARE YOU?               *"
+ "\n*                                                     *"
+ "\n*              What would you like to eat?            *"
+ "\n*-----------------------------------------------------*"
+ "\n*     .n.                                     .n.     *"
+ "\n*     0M0     Choice #1: Corn Dog             0M0     *"
+ "\n*     0M0                                     0M0     *"
+ "\n*     0M0                                     0M0     *"
+ "\n*     UMU     Choice #2: Hot Dog: SOLD OUT    UMU     *"
+ "\n*      Y                                       Y      *"
+ "\n*      |                                       |      *"
+ "\n*      |      Choice #3: Fries: SOLD OUT       |      *"
+ "\n*                                                     *"
+ "\n*-----------------------------------------------------*"
+ "\n* C - Buy a corndog                                   *"
+ "\n* H - Buy a hot dog                                   *"
+ "\n* F - Get some fries                                  *"
+ "\n* Q - Leave the food court                            *"
+ "\n*******************************************************"
+ "\n\tWhat would you like to do? ");
    }
    
    @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "C" :
                    this.buyCornDog();
                    break;
            case "H" :
                    System.out.println("Sorry, we are out of hot dogs...");
                    break;
            case "F" :
                    System.out.println("No fries left, get something else.");
                    break;
            case "D" :
                    this.display();
                    break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }


    private void buyCornDog() {
        System.out.println("\n** buyFood() **");
        
    }
}
