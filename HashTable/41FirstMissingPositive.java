class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++)
        { 
            set.add(nums[i]);
        }
        
        int i = 1;
        while (i <= nums.length)
        {
            if (!set.contains(i)) 
            {
                return i ;
            }

            i++;
        }
        return i;
    }
}