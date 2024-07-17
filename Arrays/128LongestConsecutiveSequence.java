class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);
        int max = 1;
        int len = Integer.MIN_VALUE;
        int count = 1;

        if (nums.length == 0)
        {
            return 0;
        }

        for (int i = 0; i<nums.length; i++) 
        {
            if (nums[i]-1 == len) 
            {
                len = nums[i];
                count++;
            } 
            else if (nums[i] != len) 
            {
                len = nums[i];
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;  
    }
}