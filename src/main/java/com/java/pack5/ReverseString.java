package com.java.pack5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        return new String(charArray);
    }
}

