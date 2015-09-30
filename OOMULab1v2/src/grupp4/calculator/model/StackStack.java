/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;

import grupp4.calculator.model.tokens.Token;
import java.util.Stack;

/**
 *
 * @author Lennart
 */
public class StackStack implements Istack{
    private Stack<Token> st;
    
    public StackStack(){
        st = new <Token>Stack();
    }
    
    @Override
    public void push(Token token) {
        st.push(token);
    }

    @Override
    public Token pop() {
        return (st.pop());
    }

    @Override
    public Token peek() {
        return(st.peek());
    }

    @Override
    public Boolean isEmpty() {
        return(st.isEmpty());
    }

    
}
