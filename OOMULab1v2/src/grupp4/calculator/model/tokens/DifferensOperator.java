/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.Istack;

/**
 * Java class representing the '-' operator.
 */
public class DifferensOperator extends Operator{

    public DifferensOperator() {
    }
    
    /**
     *Returns the operator in form of an string.
    * @return the operator in string format.
     */
    @Override
     public String toString(){
        return ("-");
    }
    
     /**
      * 
      * @param stack
      * @return
      * @throws DivideByZeroException 
      * @throws InvalidOperationException 
      */
    @Override
    public double Calc(Istack stack) throws DivideByZeroException, InvalidOperationException{
        double r, Right, Left;
        Token tok;
        
        if(stack.isEmpty()){
            throw new InvalidOperationException();
        }
        tok = stack.pop();
        Right = tok.Calc(stack);
        
        if(stack.isEmpty()){
            throw new InvalidOperationException();
        }
        tok = stack.pop();
        Left = tok.Calc(stack);
        
        r = Left - Right;
        return r;
    }
    
}
