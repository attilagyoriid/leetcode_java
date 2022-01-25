package ag.algorithms.leetcode.solutions.strings;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class FirstUniqueCharacterTest {

    @Test
    void find() {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        Assertions.assertThat(firstUniqueCharacter.find("teaagetgbhjkllkjh")).isEqualTo(8);

    }
}