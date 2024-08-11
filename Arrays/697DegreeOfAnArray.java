class Solution {
    public int findShortestSubArray(int[] nums) 
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();

        for (int num : nums) 
        {
            if (map1.containsKey(num))
            {
                map1.put(num, map1.get(num)+1);
            }
            else
            {
                map1.put(num, 1);
            }
        }

        for (int i=0; i<nums.length; i++) 
        {
            int num = nums[i];

            if (!map2.containsKey(num)) 
            {
                map2.put(num, i);
            }

            map3.put(num, i);
        }

        int degree = Integer.MIN_VALUE;

        for (int key : map1.keySet()) 
        {
            degree = Math.max(degree, map1.get(key));
        }

        int length = Integer.MAX_VALUE;

        for (int key : map1.keySet()) 
        {
            if (map1.get(key) == degree) 
            {
                int size = map3.get(key) - map2.get(key) + 1;
                length = Math.min(length, size);
            }
        }

        return length; 
    }
}