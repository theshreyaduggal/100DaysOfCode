class Solution {
    public int deleteAndEarn(int[] nums) 
    {
        if(nums.length == 1) 
        {
            return nums[0];
        }
        
        int max = 0;
        
        for(int i : nums) 
        {
            max = Math.max(max, i);
        }

        int storage[] = new int[max+1];
        
        for(int i : nums) 
        {
            storage[i] = storage[i] + i;
        }
        
        for(int i=2; i<=max; i++)
        {
            storage[i] = Math.max(storage[i-1], storage[i-2]+storage[i]);
        }
        
        return storage[max];    
    }
}