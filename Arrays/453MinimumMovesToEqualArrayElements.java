class Solution {
    public int minMoves(int[] nums) 
    {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums)
        {
            if(num < min)
            {
                min = num;
            }
        }

        for(int num : nums)
        {
            sum = sum + (num - min);
        }   
        
        return sum;    
    }
}