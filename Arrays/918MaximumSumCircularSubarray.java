class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
        int currMax = 0;
        int currMin = 0;
        int sum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int num : nums) 
        {
            currMax = Math.max(currMax, 0) + num;
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin, 0) + num;
            minSum = Math.min(minSum, currMin);

            sum = sum + num;  
        }
        if (sum == minSum)
        {
            return maxSum;
        } 
        else
        {
            return Math.max(maxSum, sum - minSum);
        }   
    }
}