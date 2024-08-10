class Solution {
    public int getMaxLen(int[] nums) 
    {
        int pos = 0;
        int neg = 0;
        int prod = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                pos = 0;
                neg = 0;
            } 
            else if(nums[i] > 0)
            {
                pos++;
               
                if (neg == 0 )
                {
                    neg = 0;
                }
                else
                {
                    neg = neg + 1;
                }
                
            } 
            else
            {
                int temp = pos;

                if (neg == 0)
                {
                    pos = 0; 
                }
                else
                {
                    pos = neg+1;
                }

                neg = temp+1;
            }

            prod = Math.max(pos, prod);
        }
        
        return prod;    
    }
}