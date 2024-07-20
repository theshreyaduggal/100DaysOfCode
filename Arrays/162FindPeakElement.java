class Solution {
    public int findPeakElement(int[] nums) 
    {
        int peak = 0;
        for (int i=1; i<nums.length; i++)
        {
            if (nums[peak] < nums[i])
            {
                peak = i;
            }
        }    
        return peak;
    }
}