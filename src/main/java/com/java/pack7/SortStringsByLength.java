package com.java.pack7;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C"};

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Sorted strings by length: " + Arrays.toString(strings));
    }
}

