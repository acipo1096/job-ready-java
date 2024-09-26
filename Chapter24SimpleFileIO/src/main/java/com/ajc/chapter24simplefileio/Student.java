/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter24simplefileio;

/**
 *
 * @author ALEXCIP96
 */
public class Student {

    private String firstName;
    private String lastName;
    private String studentId;
    private String cohort; // Java cohort month/year
    
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
