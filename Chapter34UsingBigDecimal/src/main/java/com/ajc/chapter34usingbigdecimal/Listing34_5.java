/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter34usingbigdecimal;

/**
 *
 * @author ALEXCIP96
 */

import java.math.BigDecimal;

public class Listing34_5 {
    
    public static void main(String[] args) {
        
        BigDecimal aNum = new BigDecimal("10");
        BigDecimal bNum = new BigDecimal("6");
        BigDecimal result;
        
        result = aNum.add(bNum);
        System.out.println("Adding: " + result);
        
        result = aNum.subtract(bNum);
        System.out.println("Subtracting: " + result);
        
        result = aNum.multiply(bNum);
        System.out.println("Multiplying: " + result);
        
    }
}
