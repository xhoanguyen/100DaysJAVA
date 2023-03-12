package com.katas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
public class AnagramsFinder {


    public static Set<String> readFileToSet(String fileName) {

        Set<String> contentSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentSet.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentSet;
    }

    private static void readFileToConsole(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void findPermutations(String str) {

        // base case
        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }


}
