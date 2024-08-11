class Solution {
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
          
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else
            {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b)->{
            if(map.get(a) == map.get(b))
            {
                return b - a;
            }
            else
            {
                return map.get(a) - map.get(b);
            }
        });

        int[] array = new int[nums.length];
        int k = 0;

        for(int num : list)
        {
            for(int i=0; i<map.get(num); i++)
            {
                array[k] = num;
                k++;
            }
        }
        return array;    
    }
}