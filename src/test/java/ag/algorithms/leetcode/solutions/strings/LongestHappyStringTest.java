package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LongestHappyStringTest {

    @Test
    void getLongestHappyString() {
        LongestHappyString longestHappyString = new LongestHappyString();
        Assertions.assertThat(longestHappyString.getLongestHappyString(1,1,7)).isEqualTo("ccaccbcc");
    }
}