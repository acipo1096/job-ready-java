/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Listing33_5 {
    
    public static void main(String[] args) {
        
        // The output may vary depending on your system
        // But in this case, it matched the book exactly
        
        LocalDate ld = LocalDate.parse("2020-12-25");
        System.out.println("Starting date: " + ld);
        
        String formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);
        
        System.out.println(ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        
        System.out.println(ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        
        System.out.println(ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }
    
}
