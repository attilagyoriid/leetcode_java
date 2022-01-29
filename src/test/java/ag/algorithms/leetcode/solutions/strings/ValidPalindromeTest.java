package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isValid() {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        Assertions.assertThat(validPalindrome.isValid("this is A plaindrome   emordnialpa sis iht ")).isTrue();

    }

    @Test
    void isNotValid() {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        Assertions.assertThat(validPalindrome.isValid("this is a skl plaindrome   emordnialpa sis iht ")).isFalse();

    }
}