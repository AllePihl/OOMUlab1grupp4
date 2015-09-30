/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;


import grupp4.calculator.exeptions.*;
import grupp4.calculator.model.tokens.*;
import java.util.*;

/**
 *
 * @author Lennart
 */
public class RPNCalculator {
      
    public RPNCalculator(){
    }
    /**
     * Calculates target input string
     * @param Exp 
     * @return Calculated result as a string
     * @throws InvalidTokenException
     * @throws DivideByZeroException 
     */
    public String calc(String Exp) throws InvalidTokenException, DivideByZeroException{
        double res;
        Istack st = new StackStack();
        StringTokenizer strTok = new StringTokenizer(Exp);
        String str;
        
        
        try{
               while(strTok.hasMoreTokens()){
                    str = (strTok.nextToken());
                    if (isNumeric(str)){
                        st.push(new Operand(str));
                    }
                    else if(isOperator(str)){
                        switch(str){
                            case "+":
                                st.push(new SummaOperator());
                                break;
                            case "-":
                                st.push(new DifferensOperator());
                                break;
                            case "*":
                                st.push(new ProduktOperator());
                                break;
                            case "/":
                                st.push(new KvotOperator());
                                break;
                            case "%":
                                st.push(new ModulusOperator());
                                break;
                            default:
                                throw new InvalidTokenException(str);
                        }
                    }else {
                        throw new InvalidTokenException(str);
                    }
                }
        
            Token token;
            token = st.pop();
            res =  token.Calc(st);

            if(!st.isEmpty()){
                throw new InvalidOperationException();
            }
               
        return Double.toString(res);
        
        } catch(InvalidTokenException ite){
            return ite.getMessage();
        }catch(ArithmeticException are){
            return are.getMessage();
        }catch(InvalidOperationException ioe){
            return ioe.getMessage();
        }catch(NumberFormatException nfe){
            System.out.println(nfe.getMessage());
            return nfe.getMessage();
        }catch (DivideByZeroException dbze){
            return dbze.getMessage();
        }
        
    }
 
    /**
     * 
     * @param s
     * @return True if target string equals an operand
     */
    private boolean isNumeric(String s) {  
        return s.matches("[-+]?\\d*\\.?\\d+");  
    }
    /**
     *
     * @param s
     * @return True if target string equals an operator
     */
    private boolean isOperator(String s){
        return s.matches("[+-/*%]");
    }

}
