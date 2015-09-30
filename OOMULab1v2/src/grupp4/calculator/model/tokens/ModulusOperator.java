/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exeptions.DivideByZeroException;
import grupp4.calculator.model.Istack;

/**
 * java class representing the '%' operator.
 */
public class ModulusOperator extends Operator{

    public ModulusOperator() {
    }
    
    /**
     * Returns the operator in form of an string.
     * @return the operator in string format.
     */
    @Override
     public String toString(){
        return ("%");
    }
    

    /**
     * 
     * @param stack
     * @return
     * @throws DivideByZeroException is thrown when the denominator is zero
     */
    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        double r, Right, Left;
        Token tok;
        
        tok = stack.pop();
        Right = tok.Calc(stack);
        
        tok = stack.pop();
        Left = tok.Calc(stack);
        
        if(Right == 0){
            throw new DivideByZeroException(Double.toString(Left) + " % " + Double.toString(Right));
        }
                
        r = Left % Right;
        return r;
    }
    
}
