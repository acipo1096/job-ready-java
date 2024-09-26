/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.controller;

import com.ajc.classroster.dao.ClassRosterDao;
import com.ajc.classroster.dao.ClassRosterPersistenceException;
import com.ajc.classroster.dao.ClassRosterDaoFileImpl;
import com.ajc.classroster.dto.Student;
import com.ajc.classroster.service.ClassRosterDataValidationException;
import com.ajc.classroster.service.ClassRosterDuplicateIdException;
import com.ajc.classroster.service.ClassRosterServiceLayer;
import com.ajc.classroster.ui.ClassRosterView;
import com.ajc.classroster.ui.UserIO;
import com.ajc.classroster.ui.UserIOConsoleImpl;
import java.util.List;

/* 
* In Lesson 29, we modify the controller so it uses our new service layer instead of directly using the DAO
* 1. Replace the member field of type ClassRosterDao with a member filed of type ClassRosterServiceLayer
* 2. Modify the constructor, replacing the ClassRosterDao parameter with a ClassRosterServiceLayer parameter
* 3. Replace all the calls to DAO methods with calls to service layer methods
*/

public class ClassRosterController {
      
    private ClassRosterServiceLayer service;
    private ClassRosterView view;
    private UserIO io = new UserIOConsoleImpl();
    
    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
        
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void createStudent() throws ClassRosterPersistenceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {            
            Student currentStudent = view.getNewStudentInfo();
            try {
                service.createStudent(currentStudent);
                view.displayCreateSuccessBanner();
                hasErrors = false;     
                
                // To handle more than one exception type in a single catch block
                // List all the exception types to be handled in the catch block separated by the | operator followed by a single identifier
                // However, if you code it this way, none of the exceptions in the single catch block can be in the same hierarchy i.e. FileNotFoundException | IOException
            } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }
    private void listStudents() throws ClassRosterPersistenceException {
        view.displayDisplayAllBanner();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterPersistenceException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = service.getStudent(studentId);
        view.displayStudent(student);
    }
    
    private void removeStudent() throws ClassRosterPersistenceException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = service.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
}
