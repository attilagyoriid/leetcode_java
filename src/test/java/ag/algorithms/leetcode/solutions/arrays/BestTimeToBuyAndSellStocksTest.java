package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStocksTest {

    @Test
    void calculate() {
        BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();
        int result = bestTimeToBuyAndSellStocks.calculate(new int[]{7, 1, 5, 3, 6, 4});
        Assertions.assertThat(result).isEqualTo(5);
    }
}