class Solution {
    public int thirdMax(int[] nums) 
    {
        int thirdMax = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums)
        {
            set.add(num);
        }
         
        for(int num:set)
        {
            list.add(num);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        if(list.size() < 3)
        {
            return list.get(0);
        }
        
        else
        {
            return list.get(2);
        }    
    }
}