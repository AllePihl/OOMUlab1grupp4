/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.controller;

import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.RPNCalculator;
import grupp4.calculator.view.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Lennart
 */
public class Controller {

    public void run(String[] args) throws InvalidTokenException, DivideByZeroException{
        ViewInterface view;
        
        if(args.length == 0){
            view = new ConsoleView();
        }
        else{
            view = new FileView();
        }
        view.RenameThisFunction(args);
        
    }
}
     

