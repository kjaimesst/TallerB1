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
public class TriangleTest {
    
    public TriangleTest() {
    }

    @Test
    public void testArea() {
        System.out.println("area");
        double base = 22.2;
        double height = 123.2;
        Triangle instance = new Triangle();
        double expResult = 123.2;
        double result = instance.area(base, height);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHypotenuse() {
        System.out.println("hypotenuse");
        double base = 1223.4;
        Triangle instance = new Triangle();
        double expResult = 563634.2;
        double result = instance.hypotenuse(base);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Triangle instance = new Triangle();
        double expResult = 34324.2;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
