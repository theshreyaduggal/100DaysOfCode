class Solution {
    public int maximizeSum(int[] nums, int k) 
    {
        int sum = 0;
        int n = nums.length-1;
        Arrays.sort(nums);
        for (int i=0; i<k; i++)
        {
            sum = sum + nums[n];
            nums[n] = nums[n] + 1;
        } 
        return sum;   
    }
}