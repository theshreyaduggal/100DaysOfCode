class Solution {
    public int maxProductDifference(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = (nums[n-2]*nums[n-1]) - (nums[0]*nums[1]);

        return ans;

    }
}