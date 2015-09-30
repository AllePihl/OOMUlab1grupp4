/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exeptions.DivideByZeroException;
import grupp4.calculator.model.Istack;

/**
 *Abstract class 
 * 
 * 
 */
public abstract class Token{
     
    /**
     * Abstract method.
     * Calculates target calculation.
     * @param stack 
     * @return Answer of calculation whit target operator
     * @throws DivideByZeroException Only DifferensOperator and ModulusOperator Throws DivideByZeroException
     */
    public abstract double Calc(Istack stack) throws DivideByZeroException;
}
