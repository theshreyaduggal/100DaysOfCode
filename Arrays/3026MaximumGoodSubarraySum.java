class Solution {
    public long maximumSubarraySum(int[] nums, int k) 
    {
        HashMap<Integer, Long> map = new HashMap<>();
        long sum = Long.MIN_VALUE;
        long[] array = new long[nums.length+1];
        
        for(int i=0; i<nums.length; i++)
        {
            array[i+1] = array[i]+nums[i];

            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], array[i]);
            } 
            else
            {
                map.put(nums[i], Math.min(array[i], map.get(nums[i])));
            }
            
            if(map.containsKey(nums[i]-k))
            {
                sum = Math.max(sum, array[i+1]-map.get(nums[i]-k));
            }
            if(map.containsKey(nums[i]+k))
            {
                sum = Math.max(sum, array[i+1]-map.get(nums[i]+k));
            }
        }
        
        if (sum == Long.MIN_VALUE)
        {
            return 0;
        }
        else
        {
            return sum;
        }    
    }
}