package com.java.jan29;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.print("Enter a message: ");
            String message = scanner.nextLine();
            writer.println(message);

            Scanner responseScanner = new Scanner(socket.getInputStream());
            System.out.println("Server Response: " + responseScanner.nextLine());

            responseScanner.close();
            scanner.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

