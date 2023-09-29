/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.tallerb1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Oriana
 */
public class Person {

    private LocalDate birthDate;
    private String age;
    private String months;
    private String days;

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        return age.getYears();
    }

    public int getMonths() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        return age.getMonths();
    }

    public int getDays() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        return age.getDays();
    }

}
