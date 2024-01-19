package com.java.pack3;

import java.util.HashMap;

public class HashMapExceptionHandling {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        try {
            ages.put("John", 25);
            ages.put("Alice", 30);
            ages.put("Ganesh", null);

            String name = "Ganesh";
            int age = ages.get(name); // May throw NullPointerException
            System.out.println(name + "'s age: " + age);
        } catch (NullPointerException e) {
            System.out.println("Age not available for the specified name.");
        }
    }
}

