package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Anagram anagram = new Anagram();
        Assertions.assertThat(anagram.isAnagram("anagram", "margana")).isTrue();
    }
}