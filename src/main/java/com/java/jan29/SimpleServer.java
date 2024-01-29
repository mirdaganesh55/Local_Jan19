package com.java.jan29;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket clientSocket = serverSocket.accept();

            Scanner scanner = new Scanner(clientSocket.getInputStream());
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            String message = scanner.nextLine();
            System.out.println("Received: " + message);

            writer.println("Server: Message received!");

            scanner.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

