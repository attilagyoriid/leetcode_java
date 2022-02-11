package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {

        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertThat(validParentheses.isValid("[({})]")).isTrue();
    }

    @Test
    void isValid_2() {

        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertThat(validParentheses.isValid("[]({})")).isTrue();
    }

    @Test
    void isValid_Failure() {

        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertThat(validParentheses.isValid("[]({)}")).isFalse();
    }
}