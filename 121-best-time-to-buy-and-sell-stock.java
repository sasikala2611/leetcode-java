
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int n = prices.length;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            int currentProfit = prices[i] - min;

            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }
}
