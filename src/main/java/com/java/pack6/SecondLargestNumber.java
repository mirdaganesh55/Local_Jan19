package com.java.pack6;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second Largest Number: " + secondMax);
    }
}

