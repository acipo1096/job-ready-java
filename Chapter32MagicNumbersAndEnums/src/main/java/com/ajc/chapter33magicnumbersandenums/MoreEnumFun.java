/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33magicnumbersandenums;

/**
 *
 * @author ALEXCIP96
 */
public class MoreEnumFun {
    
    public static void main(String[] args) {
        
        Month month = Month.JANUARY;
        System.out.println("Month: " + month.numberOfDays());
        System.out.println("====");
        
        for (Month i : Month.values()) {
            System.out.println("Month: " + i + " - " + i.monthToNumber()
                + " - " + i.numberOfDays() + " - " + i.monthToSeason());
        }
    }
    
    // Declared with the enum keyword
    // Sets the type as enum instead of standard class
    
    // The members of the enum, by default, are declared by default as public final
    // Once defined, they cannot be changed
   
    public enum Month {
        JANUARY(1,31),
        FEBRUARY(2,28),
        MARCH(3,31),
        APRIL(4,30),
        MAY(5,31),
        JUNE(6,30),
        JULY(7,31),
        AUGUST(8,31),
        SEPTEMBER(9,30),
        OCTOBER(10,31),
        NOVEMBER(11,30),
        DECEMBER(12,31);
        
        // To maintain the value for the enum, we declared two private variables
        // to hold the values as well as declared a constructor to assign
        // the values
        private int order;
        private int days;
        
        // The constructor assigns the initializing value into the private 
        // variables of our existing enum
        Month(int order, int days) {
            this.order = order;
            this.days = days;
        }
        
        // Member functions allow us to access the above values
        int numberOfDays() {
            return days;
        }
        
        int monthToNumber() {
            return order;
        }
        
        String monthToSeason() {
            String season;
            
            switch(this) {
                case JANUARY:
                case FEBRUARY:
                case MARCH:
                    season = "Winter";
                    break;
                case APRIL:
                case MAY:
                case JUNE:
                    season = "Spring";
                    break;
                case JULY:
                case AUGUST:
                case SEPTEMBER:
                    season = "Summer";
                    break;
                case OCTOBER:
                case NOVEMBER:
                case DECEMBER:
                    season = "Fall";
                    break;
                default:
                    season = "Unknown";
                    break;
            }
            return season;
        }
    }
}
