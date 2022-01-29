package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramGroupsTest {

    @Test
    void group() {
        AnagramGroups anagramGroups = new AnagramGroups();
        List<List<String>> result = anagramGroups.group(Arrays.asList("abcd", "eeff", "ab", "ffee", "dcab", "efef", "ba", "bb"));
        System.out.println(result);
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("bb"));
        expected.add(List.of("ab", "ba"));
        expected.add(List.of("abcd", "dcab"));
        expected.add(List.of("eeff", "ffee", "efef"));
        Assertions.assertThat(result).hasSameElementsAs(expected);
    }
}