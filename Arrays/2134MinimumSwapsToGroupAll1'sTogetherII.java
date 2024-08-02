class Solution {
    public int minSwaps(int[] nums) 
    {
        int length = nums.length;
        int countOne = 0;
        for (int num : nums) 
        {
            countOne = countOne + num;
        }

        if (countOne == 0 || countOne == length)
        {
            return 0;
        }

        int countZero = 0;
        for(int i=0; i<countOne; i++)
        {
            countZero = countZero + nums[i];
        }

        int max = countZero;

        for (int i=0; i<length; i++) 
        {
            countZero = countZero - nums[i];
            countZero = countZero + nums[(i+countOne) % length];
            
            max=Math.max(max, countZero);
        }

        return countOne-max;    
    }
}