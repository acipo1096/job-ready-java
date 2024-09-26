/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ajc.chapter30doingunittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ALEXCIP96
 */
public class HappyLlamasTest {
    
    public HappyLlamasTest() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testNormalTrampoline10() {
        // GIVEN - for simple methods, this means setting up the parameters 
        boolean isNasaFabric = false;
        int numTrampolines = 10;
        
        // WHEN - for simple methods, this generally means calling the method
        // under test
        // and then capturing its return to assert on
        boolean result = HappyLlamas.areTheLlamasHappy(isNasaFabric, numTrampolines);
        
        // THEN - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra messsage to display it if it doesn't
        // match
        // 
        // There are a wide variety of assert types. Here we
        // just want to assert that it returned false, but we could have also
        // used
        // assertEquals and passed in a false value.
        
        assertFalse(result, "10 Llamas w/ Normal Trampolines Should Be Unhappy!");
    }
    
    @Test
    public void testNormalTrampoline30() {
        // GIVEN - for simple methods, this means setting up the parameters 
        boolean isNasaFabric = false;
        int numTrampolines = 30;

        // WHEN - for simple methods, this generally means calling the method
        // under test
        // and then capturing its return to assert on
        boolean result = HappyLlamas.areTheLlamasHappy(isNasaFabric, numTrampolines);

        // THEN - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra messsage to display it if it doesn't
        // match
        // 
        // There are a wide variety of assert types. Here we
        // just want to assert that it returned false, but we could have also
        // used
        // assertEquals and passed in a false value.
        assertTrue(result, "30 Llamas w/ Normal Trampolines Should Be Happy!");
    }
}
