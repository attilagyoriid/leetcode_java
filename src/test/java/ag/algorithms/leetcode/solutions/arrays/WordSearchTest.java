package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {

    @Test
    void isFound() {
        WordSearch wordSearch = new WordSearch();

        char[][] grid = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assertions.assertThat(wordSearch.isFound(grid, "ABCCED")).isTrue();

    }
}