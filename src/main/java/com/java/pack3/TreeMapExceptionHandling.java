package com.java.pack3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExceptionHandling {
    public static void main(String[] args) {
        TreeMap<String, Object> data = new TreeMap<>();

        try {
            data.put("name", "John");
            data.put("age", 25);
            data.put("salary", 50000);

            String name = (String) data.get("name");
            int age = (int) data.get("age");
            double salary = (double) data.get("salary"); // May throw ClassCastException

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        } catch (ClassCastException e) {
            System.out.println("Type mismatch. Unable to cast to the expected type.");
        }
    }
}

