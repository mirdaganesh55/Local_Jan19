package com.java.pack6;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 3, 2, 5, 6, 4, 3, 3, 5, 5, 3};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int mostFrequentElement = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequentElement);
        System.out.println("Frequency: " + maxFrequency);
    }
}

