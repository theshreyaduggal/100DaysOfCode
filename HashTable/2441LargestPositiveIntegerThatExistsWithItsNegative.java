class Solution {
    public int findMaxK(int[] nums) 
    {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            map.put(nums[i], 1);
        }

        for (int j=nums.length-1; j>=0; j--)
        {
            if (map.containsKey(-nums[j]))
            {
                return nums[j];
            }
        }    
        return -1;

    }
}