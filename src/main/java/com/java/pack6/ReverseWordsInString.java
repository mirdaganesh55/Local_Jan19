package com.java.pack6;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "Java Concept Of The Day";

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Reversed String: " + result.toString().trim());
    }
}

