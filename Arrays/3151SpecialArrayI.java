class Solution {
    public boolean isArraySpecial(int[] nums) 
    {
        boolean check = true;
       
        for (int i=0; i<nums.length-1; i++)
        { 
            check = true;
            if ((nums[i] %2 !=0 && nums[i+1]%2 != 0) || (nums[i] %2 ==0 && nums[i+1]%2 == 0) )
            {
                check = false;
                break;
            }
        }    
        return check;
    }
}