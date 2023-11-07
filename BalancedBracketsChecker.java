package com.balancedbrackets;

import java.util.Stack;

public class BalancedBracketsChecker {
    public static String isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "The entered Strings do not contain Balanced Brackets";
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return "The entered Strings do not contain Balanced Brackets";
                }
            }
        }

        if (stack.isEmpty()) {
            return "The entered String has Balanced Brackets";
        } else {
            return "The entered Strings do not contain Balanced Brackets";
        }
    }
}