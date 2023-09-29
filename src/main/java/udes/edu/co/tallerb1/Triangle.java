/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.tallerb1;

/**
 *
 * @author Oriana
 */
public class Triangle {

    private double a = 4;
    private double b = 0;
    private double sideA;
    private double sideB;
    private double sideC;

    public double area(double base, double height) {
        return (base * height) / 2;
    }

    public double hypotenuse(double base) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(b, 2));
    }

    public double perimeter() {
        return (sideA + sideB + sideC);
    }
}


