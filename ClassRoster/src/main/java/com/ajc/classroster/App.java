/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.classroster;

import com.ajc.classroster.controller.ClassRosterController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.ajc.classroster.dao.ClassRosterAuditDao;
//import com.ajc.classroster.dao.ClassRosterAuditDaoFileImpl;
//import com.ajc.classroster.dao.ClassRosterDao;
//import com.ajc.classroster.dao.ClassRosterDaoFileImpl;
//import com.ajc.classroster.service.ClassRosterServiceLayer;
//import com.ajc.classroster.service.ClassRosterServiceLayerImpl;
//import com.ajc.classroster.ui.ClassRosterView;
//import com.ajc.classroster.ui.UserIO;
//import com.ajc.classroster.ui.UserIOConsoleImpl;


// The App class is responsible for wiring or assembling the components of our application
// After Chapter 29, it instantiates the new Audit DAO and wires it into the service layer
public class App {

    public static void main(String[] args) {
        
//        // Code before Spring Implementation
        
//        // Instantiate the UserIO implementation
//        UserIO myIo = new UserIOConsoleImpl();
//        // Instantiate the View and wire the UserIO implementation into it
//        ClassRosterView myView = new ClassRosterView(myIo);
//        // Instantiate the DAO
//        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
//        // Instantiate the Audit DAO
//        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
//        // Instantiate the service layer and wire the DAO and Audit DAO into it
//        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
//        // Instantiate the Controller and wire the service layer into it

        // Java object that holds the application context defined in our XML file
        // ClassPathXmlApplicationContext is the particular implementation
        // We pass the name of our Spring application context configuration file to the constructor of it
        
        // In order for the errors to disappear, I had to click the bulb,
        // search for Maven dependencies for each, locally
        // THEN add the imports
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // The getBean method retrieves the beans instantiated by the Spring application context
        // First parameter is the id of the bean we want, controller
        // Second parameter is the type of bean you want to retrieve
        // Because the Spring application context can instantiate and hold on to objects of any type, 
        // it uses Object references for all of them
        // When we retrieve a reference from the application context, we must tell the Spring container
        // the underlying type of the reference we want to retrieve so that the container can cast it to the correct
        // type for us
        
        ClassRosterController controller = ctx.getBean("controller", ClassRosterController.class);
        
        // Pre-Spring implementation code
        // ClassRosterController controller = new ClassRosterController(myService, myView);
        controller.run();
        
    }
}
