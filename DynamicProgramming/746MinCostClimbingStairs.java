class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {
        int n = cost.length;
        if (n < 2)
        {
            return 0;
        }    

        int[] storage = new int[n];
        storage[0] = cost[0];
        storage[1] = cost[1];

        for (int i=2; i<n; i++)
        {
            storage[i] = Math.min(storage[i-1], storage[i-2]) + cost[i];
        }

        return Math.min(storage[n-1], storage[n-2]);
    }
}