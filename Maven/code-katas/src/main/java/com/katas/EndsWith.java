package com.katas;

public class EndsWith {

    public static void main(String[] args) {

    }

    public static boolean solution(String str, String ending) {

        if (ending.length() > str.length())
            return false;

        for (int i = ending.length() - 1, j = str.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (ending.charAt(i) != str.charAt(j))
                return false;
        }

        return true;
    }

    public static boolean best_solution(String str, String ending) {

        return str.endsWith(ending);
    }

}