/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import java.io.PrintWriter;
import zombiestuff.ZombieStuff;

/**
 *
 * @author T4d3-T550
 */
public class ErrorView {
    private static final PrintWriter errorFile = ZombieStuff.getOutFile();
    private static final PrintWriter logFile = ZombieStuff.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println("*********************************************"
                +"\n* ERROR MESSAGE: " + errorMessage
                +"\n*********************************************");
        logFile.println(className + " - " + errorMessage);
    }
}
