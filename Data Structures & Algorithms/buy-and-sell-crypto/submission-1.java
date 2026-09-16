class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int leftIdx = 0, rightIdx = 1;
        while(leftIdx < prices.length && rightIdx < prices.length) {
            if(prices[leftIdx] > prices[rightIdx]){
                leftIdx = rightIdx;
                rightIdx++;
                continue;
            } 
            int profit = prices[rightIdx] - prices[leftIdx];
            if(profit > result) {
                result = profit;
            }
            rightIdx++;
        }
        return result;
    }
}
