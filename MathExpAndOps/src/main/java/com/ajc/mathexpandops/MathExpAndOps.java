/*
 * Program to shwo the use of expressions and operators
 * Comments provided throughout to explain what is happening
 */

package com.ajc.mathexpandops;

/**
 *
 * @author ALEXCIP96
 */
public class MathExpAndOps {

    public static void main(String[] args) {
        // Declare variables to be used in the examples
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        //
        // Assignment
        // 
        // Initialize result with the value of 0 by using the 
        // assignment (=) operator. The assignemtn operator takes the 
        // value on the right and assigns it to the variable on the 
        // left
        result = 0; // now result has the value of 0
        
        // Initialize the operands
        operand1 = 5;
        operand2 = 7;
        
        // Assignment works with variable values as well as literal 
        // values. We'll set operand3 to the same value as operand2
        operand3 = operand2; // now both have the value of 7
        
        //
        // Addition
        //
        // Addition is a binary infix operator. It works with
        // literals.
        result = 42 + 53; // result is now 95
        System.out.println(result);
        
        // It also works with variables
        result = operand1 + operand2; // result now equals 12
        System.out.println(result);
        
        // It works with a combination of literals and variables:
        result = 1 + operand1; // result now equals 6
        System.out.println(result);
        
        // You can chain operators together:
        // result now equals 20
        result = 1 + operand1 + operand2 + operand3;
        System.out.println(result);
        
        // Finally, the += operator is used to add a value to a 
        // variable. result += operand1 is equivalent to
        // result = result + operand1.
        // NOTE: the initial value of result is used to calculate the 
        //       new value of result:
        result = 2; // set result to 2
        System.out.println(result);
        result += 4; // result is now equal to 6 (2 + 4)
        System.out.println(result);
        result += operand1; //result is now equal to 11 (6 + 5);
        System.out.println(result);
        
        //
        // Subtraction 
        // 
        // Subtraction is a binary infix operator. It works with 
        // literals:
        result = 9 - 5;
        System.out.println(result);
        
        // It also works with variables:
        result = operand1 - operand2; // result now equals -2
        System.out.println(result);
        
        // It works with a combination of literals and variables:
        result = 15 - operand1; // result now equals 10
        System.out.println(result);
        
        // You can chain subtraction operators together:
        // result now equals 0
        
        result = 19 - operand1 - operand2 - operand3;
        System.out.println(result);
        
        // Finally, the -= operator is used to add a value to a
        // variable. result -= operand1 is equivalent to 
        // result = result - operand1;
        // NOTE: the initial value of result is used to calculate the
        // new value of result:
        
        result = 2; // set result to 2
        System.out.println(result);
        
        result -= 4; // set result to -2
        System.out.println(result);
        
        result -= operand1; // result is no equal to -7
        System.out.println(result);
        
        // Multipication...Division...Modulus...skipped
        
        //
        // Prefix and Postfix operators
        // 
        // Finally, you can ue the postffix and prefix operators
        // to add 1 to a variable. The postfix adds 1 after other
        // things are done; the prefix operator adds 1 before.
        
        operand1 = 10;              // set operand to 10
        result = ++operand1;       // adds 1 to operand then sets result to 11
        System.out.println(result);
        
        operand1 = 10;                // set operand1 back to 10
        result = operand1++;         // sets result to 10, then sets operand to 11
        System.out.println(result);
        
        
        
        
        
        
    }
}
