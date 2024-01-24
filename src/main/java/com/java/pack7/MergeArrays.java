package com.java.pack7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 8, 5, 1};
        int[] array2 = {6, 3, 9, 7, 2};

        int[] mergedArray = mergeAndSortArrays(array1, array2);
        
        System.out.println("Merged and sorted array without duplicates: " + Arrays.toString(mergedArray));
    }

    private static int[] mergeAndSortArrays(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }

        int[] mergedArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            mergedArray[index++] = num;
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }
}

