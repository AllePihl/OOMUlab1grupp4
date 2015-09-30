/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exeptions.DivideByZeroException;
import grupp4.calculator.model.Istack;

/**
 *java class representing the '*' operator.
 * 
 */
public class ProduktOperator extends Operator{
    
    
    public ProduktOperator(){
    }
    
    /**
    * Returns the operator in form of an string.
    * @return the operator in string format.
    */
    @Override
     public String toString(){
        return ("*");
    }
    /**
    * Calculates target calculation.
    * @param stack 
    * @return Answer of calculation whit target operator
    * @throws DivideByZeroException Only DifferensOperator and ModulusOperator Throws DivideByZeroException
    */
     
    @Override
    public double Calc(Istack stack) throws DivideByZeroException{
        double r, Right, Left;
        Token tok;
        
        tok = stack.pop();
        Right = tok.Calc(stack);
        
        tok = stack.pop();
        Left = tok.Calc(stack);
        
        r = Left * Right;
        return r;
    }
    
    
}
