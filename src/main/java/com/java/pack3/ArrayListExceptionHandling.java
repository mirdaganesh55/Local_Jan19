package com.java.pack3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        try {
            names.add("John");
            names.add("Alice");
            names.add("Ganesh");

            System.out.print("Enter an index to retrieve a name: ");
            int index = scanner.nextInt();

            String result = names.get(index);
            System.out.println("Name at index " + index + ": " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Please enter a valid index.");
        }
    }
}

