package com.java.pack7;

public class SquareRoot {
    public static void main(String[] args) {
        double number = 25.0;

        double squareRoot = findSquareRoot(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
    }

    private static double findSquareRoot(double number) {
        double guess = number / 2.0;
        double epsilon = 1e-15;  // A very small value to determine the precision

        while (Math.abs(guess * guess - number) > epsilon * guess) {
            guess = (guess + number / guess) / 2.0;
        }

        return guess;
    }
}

