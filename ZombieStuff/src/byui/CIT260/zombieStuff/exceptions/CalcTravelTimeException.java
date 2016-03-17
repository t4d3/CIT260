/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.exceptions;

/**
 *
 * @author T4d3-T550
 */
public class CalcTravelTimeException extends Exception{

    public CalcTravelTimeException() {
    }

    public CalcTravelTimeException(String message) {
        super(message);
    }

    public CalcTravelTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcTravelTimeException(Throwable cause) {
        super(cause);
    }

    public CalcTravelTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
