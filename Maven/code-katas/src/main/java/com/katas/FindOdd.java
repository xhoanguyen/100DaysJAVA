package com.katas;

import java.util.HashMap;

public class FindOdd {

    // Given an array of integers, find the one that appears an odd number of times.
    // There will always be only one integer that appears an odd number of times.

    public static int findIt(int[] a) {

        // Create a HashMap to store integers and their counts
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int result = -1;
        if (a.length == 1)
            return result = a[0];

        // Iterate through the array and count the occurrences of each integer
        for (int num : a) {
            int count = countMap.getOrDefault(num, 0);
            countMap.put(num, count + 1);
        }

        // Iterate through the HashMap and find the integer that appears an odd number
        // of times
        for (int num : countMap.keySet()) {
            if (countMap.get(num) % 2 == 1) {
                result = num;
            }
        }

        // If no integer is found, return -1
        return result;
    }
}