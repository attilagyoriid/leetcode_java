package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordPatternTest {

    @Test
    void isValid() {
        WordPattern wordPattern = new WordPattern();
        Assertions.assertThat(wordPattern.isValid("abba", "dog cat cat dog")).isTrue();
    }

    @Test
    void isValid_failure() {
        WordPattern wordPattern = new WordPattern();
        Assertions.assertThat(wordPattern.isValid("abca", "dog cat cat dog")).isFalse();
    }
}