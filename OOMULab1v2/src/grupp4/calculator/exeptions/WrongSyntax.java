/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.exeptions;

/**
 *
 * Is thrown when the wrong amount of command line arguments is sent to the program
 */
public class WrongSyntax extends Exception{
    
    
    /**
     * 
     */
    public WrongSyntax(){
        super("”Syntax: java Calculator [källfil destinationsfil]”");
    }
    
}
