class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int sum = 0;
        for (int i=0; i<nums.length; i++)
        {
            boolean check = true;
            for (int j=0; j<nums.length; j++)
            {
                if (i!=j && nums[i] == nums[j])
                {
                    check = false;
                    break;
                }
            }
            if (check == true)
            {
                sum = sum + nums[i];
            }
        }    
        return sum;
    }
}