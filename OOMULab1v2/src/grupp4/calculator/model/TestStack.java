/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;

import grupp4.calculator.model.tokens.Token;

/**
 *TestStack implements the Istack interface
 */
public class TestStack implements Istack {
    /**
     * Implements an stack using an array of tokens
     */
    private Token[] stack;
    /**
     * uses an integer for remebering top of stack.
     */
    private int top;
    
    /**
    * generates new stack
    */
    public TestStack(){
        stack = new Token[1000];
        top = -1;
}
     /**
     * Pushes target token to the stack.
     * @param token 
     */
    @Override
    public void push(Token token){
        top++;
        stack[top]=token;
    }
    
    /**
    *Returns top token of stack by removing it from the stack 
    * @return returns the top token in the stack
    */
    @Override
    public Token pop() {
       Token result;
       result = stack[top];
       top--;
       return (result);
    }
    /**
     * Returns the top token without removing it from the stack
     * @return the top token of the stack
     */
    @Override
    public Token peek() {
       Token result;
       result = stack[top];
       return (result);
    }
    /**
     * Cheeks if stack is empty 
     * @return return true if stack is empty else false.
     */

    @Override
    public Boolean isEmpty() {
    if(top == -1){
        return (true);
    }
    else {
        return (false);
    }
    }  
          
}
