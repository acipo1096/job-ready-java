/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter7controllingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class SevenEightComparingForEqualStrings {
    public static void main(String[] args) {
        int day = 4;
        String dayName = "";
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("The day is " + dayName);
        
        if (dayName.equals("Saturday") || dayName.equals("Sunday")) {
            System.out.println("It is the weekend!");
        } else {
            System.out.println("It is a weekday!");
        }
    }
}
