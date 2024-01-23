package com.java.pack6;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        printCommonCharacters(str1, str2);
    }

    private static void printCommonCharacters(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int[] count = new int[26]; // Assuming only lowercase alphabets

        for (char ch : charArray1) {
            count[ch - 'a']++;
        }

        for (char ch : charArray2) {
            if (count[ch - 'a'] > 0) {
                System.out.print(ch + " ");
                count[ch - 'a']--;
            }
        }
    }
}


