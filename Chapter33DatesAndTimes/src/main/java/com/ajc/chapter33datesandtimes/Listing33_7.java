/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Listing33_7 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.parse("2021-01-01");
        System.out.println("Starting date: " + ld);
        System.out.println("========================");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
            
            ld = ld.plusYears(1);
        }
    }
}
