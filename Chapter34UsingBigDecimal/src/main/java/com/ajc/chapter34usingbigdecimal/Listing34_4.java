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
import java.math.RoundingMode;

public class Listing34_4 {
    
    public static void main(String[] args) {
        
        BigDecimal aNum = new BigDecimal("23.45");
        BigDecimal bNum = aNum.setScale(1, RoundingMode.HALF_UP);
        BigDecimal cNum = aNum.setScale(1, RoundingMode.HALF_DOWN);
        
        // Now, BigDecimal knows how to properly round when getting rid of
        // the second digit to the right of the decimal point
        
        System.out.println("aNum scale = " + aNum);
        System.out.println("bNum scale = " + bNum);
        System.out.println("cNum scale = " + cNum);
        
        System.out.println("aNum scale = " + aNum.scale());
        System.out.println("bNum scale = " + bNum.scale());
        System.out.println("cNum scale = " + cNum.scale());
        
    }
}
