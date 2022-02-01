package ag.algorithms.leetcode.solutions.arrays;

public class BestTimeToBuyAndSellStocks {

    public int calculate(int[] daysWithPrice) {
        if (daysWithPrice == null || daysWithPrice.length < 2) {
            return 0;
        }

        int left = 0;
        int right = 1;
        int maxProfit = Integer.MIN_VALUE;

        while (right < daysWithPrice.length) {

            if (daysWithPrice[left] < daysWithPrice[right]) {
                maxProfit = Math.max(maxProfit, daysWithPrice[right] - daysWithPrice[left]);
            } else {
                left = right;
            }
            right++;

        }

        return maxProfit;
    }
}
