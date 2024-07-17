class Solution {
    public boolean checkPossibility(int[] nums) 
    {
        int count = 0;
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i] < nums[i-1])
            {
                if (i-2>=0 && nums[i-2] > nums[i])
                {
                    nums[i] = nums[i-1];
                }
                else
                {
                    nums[i-1] = nums[i];
                }
                count++;
            }
            if (count > 1)
            {
                return false;
            }
        }    

        return true;
    }
}