package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MostCommonWordTest {

    @Test
    void getMostCommonWord() {
        MostCommonWord mostCommonWord = new MostCommonWord();
        Assertions.assertThat(mostCommonWord.getMostCommonWord("Bob hit a ball, ball, the hit BALL flew far after it was hit flew.", new String[]{"hit", "ball"})).isEqualTo("flew");
    }
}