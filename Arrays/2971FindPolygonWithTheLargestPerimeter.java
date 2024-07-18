class Solution {
    public long largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        long sum = 0;
        for (int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }   

        for (int i= nums.length-1; i>=0; i--)
        {
            int number = nums[i];
            sum = sum - number;

            if (sum > number)
            {
                return sum+number;
            }
        }
        return -1;
    }
}