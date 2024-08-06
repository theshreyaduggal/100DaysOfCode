class Solution {
    public int[] singleNumber(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) 
        {
            if (!set.contains(num)) 
            {
                set.add(num);
            } 
            else 
            {
                set.remove(num);
            }
        }

        int[] array = new int[2];
        int i = 0;

        for (int num : set) 
        {
            array[i] = num;
            i++;
        }

        return array;  
    }
}