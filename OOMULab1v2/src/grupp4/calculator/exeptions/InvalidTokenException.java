/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exeptions;


/**
 *
 *  Is thrown when an invalid token is entered to the calculator
 */
public class InvalidTokenException extends Exception {
    
    /**
     * 
     * @param Token the token that caused the exception
     */
    public InvalidTokenException(String Token){
        super("InvalidTokenException: " + Token);
    }
    
}
