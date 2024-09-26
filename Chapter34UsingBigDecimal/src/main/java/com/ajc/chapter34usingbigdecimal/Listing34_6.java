/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter34usingbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Listing34_6 {
     public static void main(String[] args) {
        
        BigDecimal aNum = new BigDecimal("10");
        BigDecimal bNum = new BigDecimal("6");
        BigDecimal result;
        
        result = aNum.divide(bNum, RoundingMode.HALF_UP);
        System.out.println("Dividng using HALF_UP: " + result);
        
        result = aNum.divide(bNum, 2, RoundingMode.HALF_UP);
        System.out.println("Dividing using a scale of 2 and HALF_UP: " + result);
        
        result = aNum.divide(bNum, 2, RoundingMode.DOWN);
        System.out.println("Dividing using a scale of 2 and DOWN: " + result);
        
    }
}
