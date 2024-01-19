package com.java.pack3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class LinkedListExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<String> tasks = new LinkedList<>();

        try {
            tasks.offer("Task 1");
            tasks.offer("Task 2");
            tasks.offer("Task 3");

            System.out.println("Next task: " + tasks.element());

            System.out.print("Enter the completed task: ");
            String completedTask = scanner.nextLine();

            if (tasks.remove(completedTask)) {
                System.out.println("Task completed. Next task: " + tasks.element());
            } else {
                System.out.println("Task not found in the list.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No more tasks in the list.");
        }
    }
}

