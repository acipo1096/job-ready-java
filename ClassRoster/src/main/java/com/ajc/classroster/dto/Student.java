/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.dto;

import java.util.Objects;

/**
 *
 * @author ALEXCIP96
 */
public class Student {
    private String firstName;
    private String lastName;
    final String studentId;

    /**
     * Adding both equals() and hashCode() methods allow us to easily compare
     * two Student objects to see if the value of their fields match
     * 
     * The default implementation of equals() compares the heap location
     * of two Student references to see if they're pointing to the same heap
     * aka, they're literally the same object
     * 
     * The hashCode of an object is a unit integer value that represents 
     * the state of that object
     * Two objects that are equal must also have the same hashCode value
     * 
     * If you override either equals or hashCode, you are expected to
     * override the other, and you should use the same properties in both
     * 
     */
    
    // I added both methods by right-clicking in the editor
    // Selecting Insert Code
    // Selecting equals() and hashCode()
    // Selecting all checkboxes for each
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.firstName);
        hash = 17 * hash + Objects.hashCode(this.lastName);
        hash = 17 * hash + Objects.hashCode(this.studentId);
        hash = 17 * hash + Objects.hashCode(this.cohort);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return Objects.equals(this.cohort, other.cohort);
    }
    
    // The above methods will let you assert on whole Student objects
    
    /**
     * 
     * Adding an overridden toString method helps with test failure messages
     * Overriding the default toString() allows us to print out
     * all the object's property values instead, which provides for
     * better insight when reading test logs
     * I added toString() similar to how I added equals() and hashCode()
     */
    
    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId + ", cohort=" + cohort + '}';
    }
    // to check their equality with another Student object
    
    // Programming language + cohort month/year
    private String cohort;
    
    public Student(String studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getCohort() {
        return cohort;
    }
    
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
