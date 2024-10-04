class Solution {
    public int minSubarray(int[] nums, int p) 
    {
        long totalSum = 0;
        for (int num : nums) 
        {
            totalSum = totalSum + num;
        }

        int rem = (int)(totalSum % p);
        
        if (rem == 0) 
        {
            return 0; 
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  
        
        long prefixSum = 0;
        int minLength = nums.length;

        for (int i=0; i<nums.length; i++) 
        {
            prefixSum = prefixSum + nums[i];

            int currentMod = (int)(prefixSum % p);
            int targetMod = (currentMod - rem + p) % p;

            if (map.containsKey(targetMod)) 
            {
                minLength = Math.min(minLength, i-map.get(targetMod));
            }

            map.put(currentMod, i);
        }

        if (minLength == nums.length)
        {
            return -1;
        }
        else
        {
            return minLength;
        }    
    }
}