package ag.algorithms.leetcode.solutions.strings;

public class ValidPalindrome {

    public boolean isValid(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            if ((left < right && text.charAt(left++) != text.charAt(right--))) {
                return false;
            }


        }

        return true;


    }
}
