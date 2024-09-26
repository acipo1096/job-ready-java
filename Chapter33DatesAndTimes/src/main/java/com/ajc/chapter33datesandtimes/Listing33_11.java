/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Listing33_11 {
    
    public static void main(String[] args) {
        
        LocalDate ld;
        GregorianCalendar legacyCalendar = new GregorianCalendar();
        
        // Step 1
        ZonedDateTime zdt = legacyCalendar.toZonedDateTime();
        
        // Step 2
        ld = zdt.toLocalDate();
        
        System.out.println(legacyCalendar);
        System.out.println(ld);
        
    }
}
