class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int currentPrice = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > currentPrice) {
                    int profit = prices[j] - currentPrice;
                    if (result < profit) result = profit;
                }
            }
        }
        return result;
    }
}
