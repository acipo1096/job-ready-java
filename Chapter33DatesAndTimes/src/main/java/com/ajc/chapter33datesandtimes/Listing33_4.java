/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Listing33_4 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.parse("2020-12-25");
        String formatted;
        
        System.out.println("Starting date: " + ld);
        
        formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd=yyyy+=+=+="));
        System.out.println(formatted);
        
        formatted = ld.format(DateTimeFormatter.ofPattern("==> MM/yyyy <=="));
        System.out.println(formatted);
        
        formatted = ld.format(DateTimeFormatter.ofPattern("yyy-dd-MM-dd-yyyy"));
        System.out.println(formatted);
    }
}
