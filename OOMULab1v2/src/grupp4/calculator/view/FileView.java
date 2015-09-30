/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;

import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.RPNCalculator;
import java.io.*;

/**
 *
 * @author alexander
 */
public class FileView implements ViewInterface{

    @Override
    public void RenameThisFunction(String[] args) throws InvalidTokenException, DivideByZeroException{
        
        try {
            BufferedReader fil= new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
            RPNCalculator c = new RPNCalculator();
            String line, result;
            
            System.out.println("Beräknar RPN uttryck från " + args[0] + "\nSkriver svaren till " + args[1]);
            while((line = fil.readLine()) != null){
             
            result = c.calc(line);
            
            writer.write(result);
            writer.newLine();
            }
            writer.close();
            System.out.println("Beräkningen är klar");
        } catch (IOException e) {
            System.out.println(e.getMessage());
	}
        
    }
     
}
    
