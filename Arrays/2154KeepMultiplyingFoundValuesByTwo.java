class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
        int i=0;
        for (; i<nums.length; i++)
        {
            if (nums[i] == original)
            {
                original = nums[i] * 2;
                i = -1;
            }
        } 
        return original;   
    }
}