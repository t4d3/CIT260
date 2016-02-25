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
public class FoodMenuView {
    public void FoodMenuView(){
        System.out.println(
               "\n*********************************************"
            +  "\n*          FEELING HUNGRY ARE YOU?          *"
            +  "\n*                                           *"
            +  "\n*         What would you like to eat?       *"
            +  "\n*-------------------------------------------*"
            +  "\n* .n.                                  .n.  *"
            +  "\n* 0M0  Choice #1: Corn Dog             0M0  *"
            +  "\n* 0M0                                  0M0  *"
            +  "\n* 0M0                                  0M0  *"
            +  "\n* UMU  Choice #2: Hot Dog: SOLD OUT    UMU  *"
            +  "\n*  Y                                    Y    *"
            +  "\n*  |                                    |    *"
            +  "\n*  |   Choice #3: Fries: SOLD OUT       |   *"
            +  "\n*                                           *"
            +  "\n*********************************************");
    }
    
    public void displayFoodMenu() {
        boolean done = false;
        do {
            this.FoodMenuView();
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid;
        valid = false;
        do {
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() != 1)
                System.out.println("ERROR: Invalid entry...must be one letter");
            else valid = true;
        } while (!valid);
        return value;
    }
    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "B" :
                    this.buyFood();
                    break;
            case "D" :
                    this.displayFoodMenu();
                    break;
            case "H" :
                    System.out.println("Sorry, we are out of hot dogs...");
            case "Q":
                break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }


    private void buyFood() {
        System.out.println("\n** buyFood() **");
        
    }
}
