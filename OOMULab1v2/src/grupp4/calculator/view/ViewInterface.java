/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;


import grupp4.calculator.exeptions.*;

/**
 *Interface for implementing views
 * 
 */
public interface ViewInterface {
    /**
     * Abstract method 
     * @param args Command line arguments
     * @throws InvalidTokenException if invalid token in file.
     * @throws DivideByZeroException 
     */
     
    public void userView(String[] args) throws InvalidTokenException, DivideByZeroException;
}
