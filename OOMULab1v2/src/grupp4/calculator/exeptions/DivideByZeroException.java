/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exeptions;

/**
 * 
 * This Exception is thrown if a denominator is zero in the Modulus and Kvot calc function
 */
public class DivideByZeroException extends Exception{
    
    /**
     * 
     * @param exp The exp that caused the Exception
     */
    public DivideByZeroException(String exp){
        super("DivideByZeroException: " + exp);
    }
    
}
