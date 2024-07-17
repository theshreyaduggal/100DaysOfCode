class Solution {
    public int minOperations(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int operations = 0;

        for(int i=0; i<nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        
        for (int key : map.keySet())
        {
            if (map.get(key) == 1)
            {
                return -1;
            }
            else if (map.get(key)%3 == 0)
            {
               operations = operations + (map.get(key)/3);
            }
            else
            {
               operations = operations + (map.get(key)/3) + 1;
            }  
        }
        return operations;   
    }
}