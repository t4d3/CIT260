/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = ZombieStuff.getInFile();
    protected final PrintWriter console = ZombieStuff.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
// the concole is not writing....
                this.console.print("\n" + this.displayMessage);
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        String value = "";
        boolean valid = false;
        try {
            do {
                value = this.keyboard.readLine();
                value = value.trim();
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "ERROR: Invalid entry; must be one letter");
                } else {
                    valid = true;
                }
            } while (!valid);
        } catch (Exception e) {
//Error messages are NOT writing....
                    ErrorView.display(this.getClass().getName(),
                            "ERROR reading input: " + e.getMessage());
        }
        return value;
    }
}