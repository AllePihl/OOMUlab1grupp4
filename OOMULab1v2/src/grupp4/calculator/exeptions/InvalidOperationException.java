/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exeptions;

/**
 *
 * This Exception is thrown if a there are tokens left in the stack when the calculations are finished
 * Or when the stack is emptied before the calculations are done
 */
public class InvalidOperationException extends Exception{
    
    /**
     * 
     */
    public InvalidOperationException(){
        super("InvalidOperationException");
    }
    
}
