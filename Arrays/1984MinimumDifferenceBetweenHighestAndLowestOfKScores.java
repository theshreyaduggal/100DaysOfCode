class Solution {
    public int minimumDifference(int[] nums, int k) 
    {
        if (nums.length == 1)
        {
            return 0;
        }

        Arrays.sort(nums);
        int sub = nums[k-1] - nums[0];

        for (int i=k; i<nums.length; i++)
        {
            sub = Math.min(sub, nums[i] - nums[i-k+1]);
        }
        return sub;
    }
}