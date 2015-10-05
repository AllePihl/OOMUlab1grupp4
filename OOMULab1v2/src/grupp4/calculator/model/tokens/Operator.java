/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.Istack;

/**
 * An abstract class representing different operators
 * 
 */
public abstract class Operator extends Token{

    @Override
    public abstract double Calc(Istack stack) throws DivideByZeroException, InvalidOperationException;
    
}

