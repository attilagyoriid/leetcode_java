package ag.algorithms.leetcode.solutions.strings;

public class ValidPalindrome2 {

    public boolean isValid(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return isPalindrome(text, left + 1, right) || isPalindrome(text, left, right - 1);
            }
            left++;
            right--;

        }

        return true;
    }

    private boolean isPalindrome(String text, int left, int right) {
        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
