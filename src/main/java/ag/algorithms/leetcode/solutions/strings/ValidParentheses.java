package ag.algorithms.leetcode.solutions.strings;

import java.util.HashMap;
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

    public boolean isValid2(String parenthesesList) {

        if (parenthesesList == null || parenthesesList.isEmpty()) {
            return false;
        }
        HashMap<Character, Character> closeToOpenPairs = new HashMap<>();
        closeToOpenPairs.put('}', '{');
        closeToOpenPairs.put(')', '(');
        closeToOpenPairs.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (char parentheses : parenthesesList.toCharArray()) {

            if (closeToOpenPairs.containsKey(parentheses)) {
                if (!stack.isEmpty() && closeToOpenPairs.get(parentheses) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(parentheses);
            }

        }

        return stack.isEmpty();

    }
}
