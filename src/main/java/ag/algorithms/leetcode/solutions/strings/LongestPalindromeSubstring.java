package ag.algorithms.leetcode.solutions.strings;

public class LongestPalindromeSubstring {

    public String compute(String text) {
        if (text == null || text.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < text.length(); i++) {

            int lengthOdd = expandAroundCenter(text, i, i);
            int lengthEven = expandAroundCenter(text, i, i + 1);
            int length = Math.max(lengthEven, lengthOdd);
            if (length > end - start) {
                start = i - ((length - 1) / 2);
                end = i + (length / 2);
            }

        }

        return text.substring(start, end + 1);


    }

    private int expandAroundCenter(String text, int left, int right) {

        if (left > right || text == null) {
            return 0;
        }

        while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
            right++;
            left--;
        }

        return right - left - 1;
    }

}
