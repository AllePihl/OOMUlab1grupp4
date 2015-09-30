/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exeptions;

/**
 *
 * @author Lennart
 */
public class DivideByZeroException extends Exception{
    
    public DivideByZeroException(String exp){
        super("DivideByZeroException: " + exp);
    }
    
}
