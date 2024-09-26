/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter33magicnumbersandenums;

/**
 *
 * @author ALEXCIP96
 */
public class IntMath {
    
    // The first formal operator of this type is MathOperator, which is the enum type we just created
    // The only values allowed are the four cases
    
    public enum MathOperator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
    
    public int calculate(MathOperator operator, int operand1, int operand2) {
        
        // When using an enum in a switch statement, the values in the case statements
        // must be unqualified - ADD vs. MathOperator.ADD
        
        switch(operator) {
            case ADD:
                
                // The return statements in each case negate the need for break statements
                return operand1 + operand2;
            case SUBTRACT:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                
                // We chose to throw this if we don't recognize the operator
               throw new UnsupportedOperationException();
        }
    }
}
