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

public class Listing34_3 {
    
    public static void main(String[] args) {
        
        BigDecimal aNum = new BigDecimal("23.45");
        BigDecimal bNum = aNum.setScale(4);
        
        
        // The scale of the values below matches the scale we set above
        System.out.println("aNum scale = " + aNum);
        System.out.println("bNum scale = " + bNum);
        System.out.println("aNum scale = " + aNum.scale());
        System.out.println("bNum scale = " + bNum.scale());
        
        // The following produces an error
        // because we didn't tell the method what rounding mode
        // to use when getting rid of the second digit to the right
        // of the decimal point
        
        bNum = aNum.setScale(1);
                 
    }
}
