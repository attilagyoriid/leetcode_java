package ag.algorithms.leetcode.solutions.strings;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String parenthesesList) {

        if (parenthesesList == null || parenthesesList.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (char parentheses : parenthesesList.toCharArray()) {

            if (parentheses == '{' || parentheses == '(' || parentheses == '[') {
                stack.push(parentheses);
            }

            if (!stack.isEmpty()) {
                if (parentheses == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (parentheses == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (parentheses == ']' && stack.peek() == '[') {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();

    }
}
