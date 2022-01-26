package ag.algorithms.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertThat(palindromeNumber.isPalindrome(131)).isTrue();
    }
}