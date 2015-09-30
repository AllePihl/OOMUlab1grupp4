/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator;


import grupp4.calculator.controller.Controller;
import grupp4.calculator.exeptions.*;

/**
 *
 * @author Lennart
 */
public class Calculator {
    public static void main(String[] args) throws InvalidTokenException, DivideByZeroException {
        
        try{
            if(args.length == 0 || args.length == 2){
                Controller controll = new Controller();
                controll.run(args);
            }else{
                throw new WrongSyntax();
            }
        
        }catch(WrongSyntax ws){
            System.out.println(ws.getMessage());
        }
    }
    
    
    
}
