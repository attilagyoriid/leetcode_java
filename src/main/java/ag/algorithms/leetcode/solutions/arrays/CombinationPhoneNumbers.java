package ag.algorithms.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationPhoneNumbers {

    public List<String> combine(String digits) {

        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        result.add("");
        String[] characterMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int currentDigit = Character.getNumericValue(digits.charAt(i));
            while (result.peek()!=null && result.peek().length() == i) {
                String permutation = result.remove();
                for (char chr : characterMap[currentDigit].toCharArray()) {
                    result.add(permutation + chr);
                }
            }
        }
        return result;

    }

    public List<String> combineRecursive(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] characterMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combineLettersRecursive(characterMap, digits, "", 0, result);
        return result;

    }

    private void combineLettersRecursive(String[] characterMap, String digits, String current, int index, List<String> result) {
        if (digits.length() == index) {
            result.add(current);
            return;
        }

        String letters = characterMap[Character.getNumericValue(digits.charAt(index))];
        for (int i = 0; i < letters.length(); i++) {
            combineLettersRecursive(characterMap, digits, current + letters.charAt(i), index + 1, result);
        }

    }
}
