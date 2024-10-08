/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.ui;

import com.ajc.classroster.dto.Student;
import java.util.List;

// We created this after first creating this view in the Controller
// If this was in the Controller, it breaks the rule that the controller should only orchestrate work
// It shouldn't do any of the work itself!

// This method takes over the functionality for printing the menu and getting the user's selection from the controller over to the view
// Uses composition - the ClassRosterView HAS A UserIO interface member and uses UserIO to interact with the user
// All it knows is that it's interacting with the user, not reading and writing to the console

public class ClassRosterView {
    final UserIO io;
    
    public ClassRosterView(UserIO io) {
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");
        
        return io.readInt("Please select from the above choices.");
            
    }
    
    public Student getNewStudentInfo() {
        Student currentStudent = new Student(io.readString("Please enter Student ID"));
        currentStudent.setFirstName(io.readString("Please enter First Name"));
        currentStudent.setLastName(io.readString("Please enter Last Name"));
        currentStudent.setCohort(io.readString("Please enter Cohort"));
        return currentStudent;
    }
    
    public void displayCreateStudentBanner() {
        io.print("=== Create Student ===");
    }
    
    public void displayCreateSuccessBanner() {
        io.readString("Student successfully created. Please hit enter to continue.");
    }
    
    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList ) {
            String studentInfo = String.format("#%s : %s %s %s",
                    currentStudent.getStudentId(),
                    currentStudent.getFirstName(),
                    currentStudent.getLastName(),
                    currentStudent.getCohort());
            io.print(studentInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }
    
    public void displayDisplayStudentBanner() {
        io.print("=== Display Student ===");
    }
    
    public String getStudentIdChoice() {
        return io.readString("Please enter the Student ID.");
    }
    
    public void displayStudent(Student student) {
        if (student != null) {
            io.print(student.getStudentId());
            io.print(student.getFirstName() + " " + student.getLastName());
            io.print(student.getCohort());
            io.print("");
        } else {
            io.print("No such student.");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayRemoveStudentBanner() {
        io.print("=== Remove Student ===");
    }
    
    public void displayRemoveResult(Student studentRecord) {
        if(studentRecord != null) {
            io.print("Student successfully removed.");
        } else {
            io.print("No such student");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayExitBanner() {
        io.print("Goodbye!!!");
    }
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
