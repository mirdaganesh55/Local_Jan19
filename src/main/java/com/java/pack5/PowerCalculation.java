package com.java.pack5;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long result = calculatePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }

    static long calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
    }
}

