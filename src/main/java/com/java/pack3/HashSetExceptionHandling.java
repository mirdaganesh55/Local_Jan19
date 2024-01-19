package com.java.pack3;

import java.util.HashSet;

public class HashSetExceptionHandling {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        try {
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);

            int divisor = 0;
            for (int number : numbers) {
                System.out.println(number / divisor); // May throw ArithmeticException
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
