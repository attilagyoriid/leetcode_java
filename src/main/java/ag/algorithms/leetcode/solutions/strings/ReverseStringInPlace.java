package ag.algorithms.leetcode.solutions.strings;

public class ReverseStringInPlace {

    public String reverse(String text) {

        int left = 0;
        int right = text.length()-1;
        char[] chars = text.toCharArray();
        char temp;
        while (left < right) {
            temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);

    }
}
