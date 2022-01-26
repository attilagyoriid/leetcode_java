package ag.algorithms.leetcode.solutions.numbers;

public class PalindromeNumber {

    public boolean isPalindrome(int num) {
        if (num == 0) {
            return true;
        }
        if (num < 0 || num % 10 == 0) {
            return false;
        }
        int divider = 1;

        while (num >= divider * 10) {
            divider *= 10;
        }

        System.out.println("divider " + divider);
        int right;
        int left;
        while (num != 0) {

            left = num / divider;
            right = num % 10;
            System.out.println("right " + right);
            System.out.println("left " + left);
            if (left != right) {
                return false;
            }
            num = (num % divider) / 10;
            divider = divider / 100;

        }

        return true;

    }
}
