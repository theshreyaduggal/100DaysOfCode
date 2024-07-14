class Solution {
    public int maxProfit(int[] prices) 
    {
        int cost = prices[0];
        int profit = 0;

        for (int i=1; i<prices.length; i++)
        {
            if(cost>prices[i])
            {
                cost = prices[i];
            }
            profit = Math.max(profit, prices[i]-cost);
        }  

        return profit;
    }
}