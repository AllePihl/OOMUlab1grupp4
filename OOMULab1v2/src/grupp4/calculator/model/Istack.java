/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;

import grupp4.calculator.model.tokens.Token;

/**
 * interface for implementing stack
 */
public interface Istack {  
   /**
    * abstract method
    * Pushes target token to the stack.
    * @param token 
    */
    public void push(Token token);
    
    /**
     * abstract method
     * Pops the top token of the stack and return the token
     * @return 
     */
    public Token pop();
    
    /**
     * Peeks at the top token and returns the token without removing the token from the stack
     * @return returns value of top token in stack as a token.
     */
    public Token peek();
    /**
     * Checks if stack is empty. if empty returns true else false
     * @return returns true if stack is empty else false.
     */
    public Boolean isEmpty();
}
