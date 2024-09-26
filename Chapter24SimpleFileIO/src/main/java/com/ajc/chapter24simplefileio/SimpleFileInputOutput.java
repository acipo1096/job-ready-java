/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter24simplefileio;

/**
 *
 * @author ALEXCIP96
 */
import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SimpleFileInputOutput {
    public static void main(String[] args) throws Exception {
              
        try(PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))) {
            out.println("this is a line in my file...");
            out.println("a second line in my file...");
            out.println("a third line in my file...");
            out.flush();
            out.close();
        }
        
        Scanner sc = new Scanner(new BufferedReader (new FileReader("OutFile.txt"))); // requires a new FileReader that includes the name of the file we want to read
        
        // go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
    }
}
