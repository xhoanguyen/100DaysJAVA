package com.katas;

import java.util.Stack;

public class Walk {
    public static void main(String args[]) {
        System.out.println(balancedParenthensies("nnnnnsssss"));
        //System.out.println(balancedParenthensies("{(a},b)"));
        //System.out.println(balancedParenthensies("{)(a,b}"));
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        if (s.length() != 10) return false;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'n' || c == 'o' || c == 's' || c == 'w' ) {
                stack.push(c);
            } else if(c == 'n') {
                if(stack.isEmpty() || stack.pop() != 's') {
                    return false;
                }
            } else if(c == 'o') {
                if(stack.isEmpty() || stack.pop() != 'w') {
                    return false;
                }
            } else if(c == 's') {
                if(stack.isEmpty() || stack.pop() != 'n') {
                    return false;
                }
            }
            else if(c == 'w') {
                if(stack.isEmpty() || stack.pop() != 'o') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
