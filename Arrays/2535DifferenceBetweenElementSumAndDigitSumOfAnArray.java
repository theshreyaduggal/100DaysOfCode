class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int sumElement = 0;
        int sumDigits = 0;
        for (int i=0; i<nums.length; i++)
        {
            sumElement = sumElement + nums[i];

            int number = nums[i]; 
            for(; number>0; number=number/10)
		    {
                int rem = number%10;
			    sumDigits = sumDigits + rem;
		    }
        }  
        int ans = Math.abs(sumElement - sumDigits);
        return ans;  
    }
}