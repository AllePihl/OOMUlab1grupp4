/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.controller;

import grupp4.calculator.exeptions.*;
import grupp4.calculator.view.*;

/**
 * 
 * Checks which view is to be used to run the calculator
 */
public class Controller {

    
    /**
     * Checks which view is to be used to run the calculator
     * @param args command line arguments
     * @throws InvalidTokenException is thrown if something wrong is entered to the calculator
     * @throws DivideByZeroException is thrown if a denominator is zero
     */
    public void run(String[] args) throws InvalidTokenException, DivideByZeroException{
        IView view;
        
        if(args.length == 0){
            view = new ConsoleView();
        }
        else{
            view = new FileView();
        }
        view.userView(args);
        
    }
}
     

