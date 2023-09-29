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
public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Square instance = null;
        double expResult = 5;
        double result = instance.getArea();
        assertEquals(expResult, result, 25);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        Square instance = null;
        double expResult = 5;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 20);
        fail("The test case is a prototype.");
    }
    
}
