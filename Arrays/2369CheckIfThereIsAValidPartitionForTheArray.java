class Solution {
    public boolean validPartition(int[] nums) 
    {
        int n = nums.length;
        boolean[] dp = new boolean[n+2];
        dp[n] = true;

        for (int i=n-2; i>=0; i--) 
        {
            int a = nums[i];
            int b = nums[i+1];
            
            if (dp[i+2]) 
            {
                if (a == b) 
                {
                    dp[i] = true;
                }
            }
            if (!dp[i] && dp[i+3]) 
            {
                int c = nums[i+2];
                
                if ((a == b && b == c) || (b-a == 1 && c-b == 1)) 
                {
                    dp[i] = true;
                }
            }
        }
        
        return dp[0];    
    }
}