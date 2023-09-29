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
public class CircleTest {
    
    public CircleTest() {
    }

    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circle instance = new Circle();
        double expResult = 22.0;
        double result = instance.getRadio();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        double radio = 3.22;
        Circle instance = new Circle();
        instance.setRadio(radio);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculatedArea() {
        System.out.println("calculatedArea");
        Circle instance = new Circle();
        double expResult = 122.3;
        double result = instance.calculatedArea();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculatedPerimeter() {
        System.out.println("calculatedPerimeter");
        Circle instance = new Circle();
        double expResult = 123.2;
        double result = instance.calculatedPerimeter();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Circle instance = new Circle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
