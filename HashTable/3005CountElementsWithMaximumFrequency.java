class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
			{
                map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i],1);
			}
        }
        
        int maxFreq = 0;
        for (int key : map.keySet())
        {
            maxFreq = Math.max(map.get(key), maxFreq);
        }

        int count = 0;
        for (int key : map.keySet())
        {
            if (map.get(key) == maxFreq)
            {
                count = count + map.get(key);
            }
        }
       
        return count;
    }
}