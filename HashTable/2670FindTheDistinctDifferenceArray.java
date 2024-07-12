class Solution {
    public int[] distinctDifferenceArray(int[] nums) 
    {
        int[] array = new int[nums.length];
        for (int i=0; i<nums.length; i++)
        {
            HashSet<Integer> set1 = new HashSet<>();
            for (int j=0; j<=i; j++)
            {
                set1.add(nums[j]);
            }

            HashSet<Integer> set2 = new HashSet<>();
            for (int k=i+1; k<nums.length; k++)
            {
                set2.add(nums[k]);
            }

            array[i] = set1.size()-set2.size(); 
        }    
        return array;
    }
}