package arrays;

public class BestTimeToBuySellStock {
    // complexity = O(n)
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowestPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
            int profitIfSoldToday = prices[i] - lowestPrice;

            if (profit < profitIfSoldToday) {
                profit = profitIfSoldToday;
            }
        }

        return profit;
    }
}
