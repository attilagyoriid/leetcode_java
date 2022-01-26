package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringInPlaceTest {

    @Test
    void reverse() {

        ReverseStringInPlace reverseStringInPlace = new ReverseStringInPlace();
        Assertions.assertThat(reverseStringInPlace.reverse("Attila")).isEqualTo("alittA");
    }
}