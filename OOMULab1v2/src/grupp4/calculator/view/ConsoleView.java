/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.view;


import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.RPNCalculator;
import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class ConsoleView implements ViewInterface{

    @Override
    public void RenameThisFunction(String[] args)  throws InvalidTokenException, DivideByZeroException{
        RPNCalculator c = new RPNCalculator();
        String result;
        
        while(true){
            System.out.print("Ange RPN uttryck <retur> (tom sträng = avsluta):");
            Scanner scan = new Scanner(System.in); 
            String str =scan.nextLine();
            if (str.isEmpty() == true){
                System.out.println("Användaren avslutade applikationen\n");
                System.exit(0);
            }
            else{
                result = c.calc(str);
                System.out.println("Resultat: "+ result);
            }   
        }
    }
}

