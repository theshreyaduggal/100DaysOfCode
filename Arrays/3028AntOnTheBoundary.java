class Solution {
    public int returnToBoundaryCount(int[] nums) 
    {
        int steps = 0;
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            steps = steps + nums[i];
            if (steps == 0)
            {
                count++;
            } 
        }   
        return count;
    }
}