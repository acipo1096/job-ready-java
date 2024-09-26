/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter35lamdasandstreams;

/**
 *
 * @author ALEXCIP96
 */
public class Person {

    private String name;
    private int age;
    
    Person (String n, int a) {
        name = n;
        age = a;
    }
    
    Person() {
        name = "empty";
        age = 0;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
