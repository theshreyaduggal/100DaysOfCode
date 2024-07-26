class Solution {
    public int jump(int[] nums) 
    {
        int jumps = 0;
        int num1 = 0;
        int num2 = 0;
       
        for(int i=0; i<nums.length-1; i++) 
        {
            num2 = Math.max(num2, i+nums[i]);

            if(i == num1) 
            {
                num1 = num2;
                jumps++;
            }
        }  
        return jumps;    
    }
}