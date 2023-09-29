/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.tallerb1;

/**
 *
 * @author Oriana
 */
public class Circle {

    private double radio;
    private double calculatedArea;
    private double calculatedPerimeter;
    private double diameter;

    public Circle() {
        radio = diameter / 2 ;
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calculatedArea() {
        return Math.PI * radio * radio;
    }

    public double calculatedPerimeter() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circle [radio=" + radio + "]";
    }

}
