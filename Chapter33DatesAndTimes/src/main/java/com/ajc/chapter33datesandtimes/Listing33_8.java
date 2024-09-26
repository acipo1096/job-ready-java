/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;

// The Period class is used to store the difference between two dates
import java.time.Period;

public class Listing33_8 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        LocalDate otherDate = LocalDate.parse("2022-01-01");
        
        Period diff = ld.until(otherDate);
        
        System.out.println("Starting date: " + ld);
        System.out.println("Other date:    " + otherDate);
        System.out.println("===========================");
        
        System.out.println("Difference: " + diff);
    }
}
