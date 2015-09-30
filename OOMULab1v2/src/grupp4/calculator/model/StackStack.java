/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;

import grupp4.calculator.model.tokens.Token;
import java.util.Stack;

/**
 * StackStack implements the Istack interface
 * 
 * @author Lennart
 */
public class StackStack implements Istack{
    /**
     * stack implementing the datatype of Token
     */
    private Stack<Token> st;
    
    /**
     * generates a new StackStack
     */
    public StackStack(){
        st = new <Token>Stack();
    }
    /**
     * Pushes target token to the stack.
     * @param token 
     */
    @Override
    public void push(Token token) {
        st.push(token);
    }
    /**
    *Returns top token of stack by removing it from the stack 
    * @return returns the top token in the stack
    */
    @Override
    public Token pop() {
        return (st.pop());
    }
    /**
     * Returns the top token without removing it from the stack
     * @return the top token of the stack
     */

    @Override
    public Token peek() {
        return(st.peek());
    }

    /**
     * Cheeks if stack is empty 
     * @return return true if stack is empty else false.
     */
    
    @Override
    public Boolean isEmpty() {
        return(st.isEmpty());
    }

    
}
