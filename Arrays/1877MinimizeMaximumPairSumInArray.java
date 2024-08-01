class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums); 
        int max = 0;
        int n = nums.length;

        for (int i=0; i<n/2; i++)
        {
            int sum = nums[i] + nums[n-1-i];
            max = Math.max(max, sum);
        }
        return max;    
    }
}