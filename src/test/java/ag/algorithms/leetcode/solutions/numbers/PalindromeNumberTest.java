package ag.algorithms.leetcode.solutions.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertThat(palindromeNumber.isPalindrome(131)).isTrue();
    }
}