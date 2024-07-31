class Solution {
    public int findNumbers(int[] nums) 
    {
        int totalCount = 0;

        for (int i=0; i<nums.length; i++)
        {
            int countDigit = 0;
            for(; nums[i]>0; nums[i]=nums[i]/10)
		    {
                countDigit++;
            }
            if (countDigit % 2 == 0)
            {
                totalCount++;
            }
        }
        return totalCount;
    }
}