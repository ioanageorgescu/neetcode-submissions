class Solution {
    public int maxProfit(int[] prices) {
        int ibuy = 0;
        int isell = 1;
        int max_profit = 0;
        while (isell < prices.length) {
            if (prices[isell] > prices[ibuy]) {
                max_profit = Math.max(max_profit, (prices[isell] - prices[ibuy]));
            } else {
                ibuy = isell;
            }
            isell++;
        }

        return max_profit;
    }
}
