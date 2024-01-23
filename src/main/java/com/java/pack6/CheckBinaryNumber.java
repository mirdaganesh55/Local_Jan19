package com.java.pack6;

public class CheckBinaryNumber {
    public static void main(String[] args) {
        long number = 101010; // Example binary number

        if (isBinary(number)) {
            System.out.println(number + " is a binary number.");
        } else {
            System.out.println(number + " is not a binary number.");
        }
    }

    private static boolean isBinary(long number) {
        while (number != 0) {
            long digit = number % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}

