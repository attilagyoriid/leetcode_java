package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordBreakTest {

    @Test
    void canBreak() {

        WordBreak wordBreak = new WordBreak();
        Assertions.assertThat(wordBreak.canBreak("leetcode", new String[]{"leet", "will", "code"})).isTrue();
    }
}