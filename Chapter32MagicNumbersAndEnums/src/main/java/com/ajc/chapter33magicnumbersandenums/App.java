/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33magicnumbersandenums;

import com.ajc.chapter33magicnumbersandenums.IntMath.MathOperator;

/**
 *
 * @author ALEXCIP96
 */
public class App {
    
    public static void main(String[] args) {
        
        IntMath num1 = new IntMath();
        int result;
        
        result = num1.calculate(MathOperator.ADD, 10, 5);
        System.out.println("Add: " + result);
        
        result = num1.calculate(MathOperator.SUBTRACT, 10, 5);
        System.out.println("Subtract: " + result);
        
        result = num1.calculate(MathOperator.MULTIPLY, 10, 5);
        System.out.println("Multiply: " + result);
        
        result = num1.calculate(MathOperator.DIVIDE, 10, 5);
        System.out.println("Divide: " + result);
    }
}
