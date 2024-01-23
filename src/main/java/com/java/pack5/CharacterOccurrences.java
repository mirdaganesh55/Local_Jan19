package com.java.pack5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCountMap = countCharacterOccurrences(input);

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}

