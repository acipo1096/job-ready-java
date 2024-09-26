///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.ajc.chapter12addingmethods;
//
///**
// *
// * @author ALEXCIP96
// */
//public class ALookAtScope {
//    public static void main(String[] args) {
//        int age = 42;
//        
//        for (int i = 0; i < 5; i++) {
//            // this is ok - the nested block can access the variables in the outer block
//            System.out.println(age);
//        }
//        
//        if ( age > 18 ) {
//            // this is ok - the nested block can access the variable in the outer block
//            int yearsToWait = 18 - age;
//        }
//        
//        // NOT ok - outer block cannot access variables declared inside inner blocks
//        System.out.println(yearsToWait);
//    }
//}
