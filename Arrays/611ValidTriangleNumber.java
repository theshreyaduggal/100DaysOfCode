class Solution {
    public int triangleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0; i<nums.length; i++) 
        {
            for(int j=i+1, k=j+1; j<(nums.length - 1) && k<=nums.length; ) 
            {
                if(k == nums.length || nums[i]+nums[j] <= nums[k])
                {
                    if(k > (j+1))
                    {
                        sum = sum + k - j - 1;
                    }
                    j++;
                }
                else
                {
                    k++;
                }
            }
        }
        return sum;    
    }
}