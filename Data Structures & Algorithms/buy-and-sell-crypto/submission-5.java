class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i]< prices[min]){
                min = i;
            }
            profit = Math.max(prices[i] - prices[min], profit);

        }
        return profit;

    }
}
