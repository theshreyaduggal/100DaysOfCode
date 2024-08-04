class Solution {
    public int maximumCount(int[] nums) 
    {
        int countPos = 0;
        int countNeg = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] > 0)
            {
                countPos++;
            }
            else if (nums[i] < 0)
            {
                countNeg++;
            }
        }    
        if (countPos >= countNeg)
        {
            return countPos;
        }
        else
        {
            return countNeg;
        }
    }
}