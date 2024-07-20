class Solution {
    public boolean canJump(int[] nums) 
    {
        if (nums.length ==1)
        {
            return true;
        }
        int jump = nums[0];
        for (int i=0; i<nums.length; i++)
        {
            if (i>jump)
            {
                return false;
            }
            if (i+nums[i] > jump)
            {
                jump = i + nums[i];
            }
        } 
        return true;
    }
}