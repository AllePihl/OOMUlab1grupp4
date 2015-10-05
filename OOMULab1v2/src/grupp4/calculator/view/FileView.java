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
 *the view class for the File view
 * uses command line arguments to read rom a file and calculate and then write to another file
 * 
 */
public class FileView implements IView{

    /**
     * gets input and output file from the Commandline arguments
     * calculates the result of the target line and wites it ti output file
     * @param args Command line arguments
     * @throws InvalidTokenException if invalid token in file.
     * @throws DivideByZeroException 
     */
    @Override
    public void userView(String[] args) throws InvalidTokenException, DivideByZeroException{
        
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
    
