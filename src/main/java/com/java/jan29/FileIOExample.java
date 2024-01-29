package com.java.jan29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello, this is a file!\nSecond line.");
            writer.close();

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

