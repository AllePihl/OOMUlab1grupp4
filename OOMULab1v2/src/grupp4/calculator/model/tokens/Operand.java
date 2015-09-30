/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.model.Istack;


/**
 * java class representing the operand.
 */
public class Operand extends Token{
    /**
     * the number stored in the operand
     */
    private double tal;
    
    
    /**
     * Operand Constructor
     * Converts the input string to a doubble and sets the Operand
     * @param tal 
     */
    public Operand(String tal){
        this.tal = Double.parseDouble(tal);
    }
    
    /**
     * 
     * @return the number as a string
     */
    @Override
    public String toString(){
        return(Double.toString(tal));
    }
    /**
     * Sets the operand
     * @param tal 
     */
    public void SetOperand(double tal){
        this.tal = tal;
    }
    /**
     * 
     * @return the stored number
     */
    public double  getOperand(){
        return (tal);
    }

    
    /**
     * 
     * @param stack
     * @return the number stored in the operand
     */
    @Override
    public double Calc(Istack stack) {
        return tal;
    }
    
    
}
