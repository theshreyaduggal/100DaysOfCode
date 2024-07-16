class Solution {
    public boolean canBeIncreasing(int[] nums) 
    {
        boolean check = false;
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i-1] >= nums[i])
            {
                if (check)
                {
                    return false;
                }
                check = true;
            } 
            if (i > 1 && nums[i] <= nums[i-2])
            {
                nums[i] = nums[i-1];
            }
        } 
        return true;
    }
}