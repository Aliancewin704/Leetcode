package org.example.Fundamental.Valid_Parentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; s.length() > i; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
            if (s.charAt(i) == '}') {
                if (stack.empty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
            if (s.charAt(i) == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
