class Solution {
    public int maxFrequency(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int max = 0;

        for(int i=nums.length-1; i>=0; i--)
        {
            int index = 1;
            int ele = k;
            int num = nums[i];

            for(int j=i-1; j>=0; j--)
            {
                if(num - nums[j] <= ele)
                {
                   index++;
                   ele = ele - (num-nums[j]);
                }
                else
                {
                    break;
                }
            }

            max = Math.max(max, index);

            if(max >= i)
            {
                break;
            }
        }
        
        return max;    
    }
}