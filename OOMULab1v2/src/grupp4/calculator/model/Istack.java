/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp4.calculator.model;

import grupp4.calculator.model.tokens.Token;

/**
 * interface for implementing stack
 * @author alexander
 */
public interface Istack {  
    
    public void push(Token token);
    public Token pop();
    public Token peek();
    public Boolean isEmpty();
}
