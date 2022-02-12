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

    @Test
    void isAnagram_failure() {
        Anagram anagram = new Anagram();
        Assertions.assertThat(anagram.isAnagram("anagram", "msargana")).isFalse();
    }

    @Test
    void isAnagram2() {
        Anagram anagram = new Anagram();
        Assertions.assertThat(anagram.isAnagram2("anagram", "margana")).isTrue();
    }

    @Test
    void isAnagram2_failure() {
        Anagram anagram = new Anagram();
        Assertions.assertThat(anagram.isAnagram2("anagram", "msargana")).isFalse();
    }
}