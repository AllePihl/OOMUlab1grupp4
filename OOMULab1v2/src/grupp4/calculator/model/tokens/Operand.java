/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model.tokens;

import grupp4.calculator.model.Istack;
/**
 *
 * @author Lennart
 */
public class Operand extends Token{
    private double tal;
    
    
    
    public Operand(String tal){
        this.tal = Double.parseDouble(tal);
    }
    
    @Override
    public String toString(){
        return(Double.toString(tal));
    }
    
    public void SetOperand(double tal){
        this.tal = tal;
    }
    public double  getOperand(){
        return (tal);
    }

    @Override
    public double Calc(Istack stack) {
        return tal;
    }
    
    
}
