package com.java.pack7;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1976, 7, 7);
        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthdate, currentDate).getYears();

        System.out.println("Age: " + age + " years");
    }
}

