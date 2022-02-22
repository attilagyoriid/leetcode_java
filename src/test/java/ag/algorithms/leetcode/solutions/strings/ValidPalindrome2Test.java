package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome2Test {

    @Test
    void isValid_happy() {

        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();
        Assertions.assertThat(validPalindrome2.isValid("abca")).isTrue();
    }

    @Test
    void isValid_happy2() {

        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();
        Assertions.assertThat(validPalindrome2.isValid("abcca")).isTrue();
    }

    @Test
    void isValid_failure() {

        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();
        Assertions.assertThat(validPalindrome2.isValid("abcza")).isFalse();
    }
}