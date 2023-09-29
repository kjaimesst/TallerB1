/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package udes.edu.co.tallerb1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oriana
 */
public class PersonTest {
    
    public PersonTest() {
    }

    @org.junit.Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = null;
        int expResult = 22;
        int result = instance.getAge();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetMonths() {
        System.out.println("getMonths");
        Person instance = null;
        int expResult = 12;
        int result = instance.getMonths();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetDays() {
        System.out.println("getDays");
        Person instance = null;
        int expResult = 12;
        int result = instance.getDays();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
