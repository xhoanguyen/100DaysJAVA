package com.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    public static String reverseLetter(final String str) {
        String result = "";

        for (String word : str.split(" ")) {
            String temp = removeAllNonAlphaNumeric(word);
            if (temp.length() > 0 && temp != null ) {
                // Reverse the word and print it
                StringBuilder reversedWord = new StringBuilder(temp).reverse();
                result += reversedWord.toString() + " " ;
            } else {
                // Print the word as is
                result += temp;
            }
            
        }
        return result.trim().toLowerCase();
        



    }


    public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z]", "");
    }

    public static void reverseLongWords(String sentence) {
        String reversedSentence = Arrays.stream(sentence.split("\\s+"))
                .map(word -> word.length() > 5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
        System.out.println(reversedSentence);
    }
    
}
