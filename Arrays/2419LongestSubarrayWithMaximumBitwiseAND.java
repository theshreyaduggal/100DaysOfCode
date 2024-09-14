class Solution {
    public int longestSubarray(int[] nums) 
    {
        int maxNum = 0;
        
        for (int num : nums) 
        {
            maxNum = Math.max(maxNum, num);
        }
        
        int max = 0;
        int count = 0;

        for (int i=0; i<nums.length; i++) 
        {
            if (nums[i] == maxNum) 
            {
                count++;
                max = Math.max(max, count);
            } 
            else
            {
                count = 0;
            }
        }
        
        return max;    
    }
}