/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;

public class Listing33_3 {
    
    public static void main(String[] args) {
        
        String isoDate = "2021-12-25";
        
        
        // Convert the String date to isoDate with parse()
        LocalDate ld = LocalDate.parse(isoDate);
        System.out.println("ld = " + ld);
        System.out.println("isoDate = " + isoDate);
        
        // To convert an isoDate to String is simple
        isoDate = ld.toString();
    }
}
