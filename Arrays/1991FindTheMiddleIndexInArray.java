class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int start = 0;
        int sum = 0;

        for (int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }  

        for (int i=0; i<nums.length; i++)
        {
            sum = sum - nums[i];
            if (start == sum)
            {
                return i;
            }
            
            start = start + nums[i];
        }
        return -1;
    }
}