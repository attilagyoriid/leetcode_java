package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void calculate() {

        MissingNumber missingNumber = new MissingNumber();
        Assertions.assertThat(missingNumber.calculate(new int[]{0,1,3})).isEqualTo(2);
    }

    @ParameterizedTest
    @MethodSource("provideItems")
    void getMissingNumber(List<Integer> items, int expected) {
        MissingNumber missingNumber = new MissingNumber();
        org.junit.jupiter.api.Assertions.assertEquals(expected,missingNumber.getMissingNumberWithSet(items));
    }

    private static Stream<Arguments> provideItems() {
        return Stream.of(
                Arguments.of(List.of(0, 3, 1), 2),
                Arguments.of(List.of(0, 1), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideItems")
    void getMissingNumberWithXOR(List<Integer> items, int expected) {
        MissingNumber missingNumber = new MissingNumber();
        org.junit.jupiter.api.Assertions.assertEquals(expected,missingNumber.getMissingNumberWithXOR(items));
    }

    @ParameterizedTest
    @MethodSource("provideItems")
    void getMissingNumberWithSubtraction(List<Integer> items, int expected) {
        MissingNumber missingNumber = new MissingNumber();
        org.junit.jupiter.api.Assertions.assertEquals(expected,missingNumber.getMissingNumberWithSubtraction(items));
    }
}