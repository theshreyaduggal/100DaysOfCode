class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) 
    {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }
        
        int total = 0;
        for (int i=0; i<nums.length; i++)
        {
            total = total + nums[i];
            result[i] = sum + (2 * (i + 1) - nums.length) * nums[i] - 2 * total;
        }

        return result;
    }
}