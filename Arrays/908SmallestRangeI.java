class Solution {
    public int smallestRangeI(int[] nums, int k) 
    {
        int max = nums[0];
        int min = nums[0];
        for (int i=1; i<nums.length; i++)
        {
            if (min > nums[i])
            {
                min = nums[i];
            }
            if (max < nums[i])
            {
                max = nums[i];
            }
        }    

        if (max-k < min+k)
        {
            return 0;
        }
        else
        {
            max = max - k;
            min = min + k;
        }

        return max-min;
    }
}