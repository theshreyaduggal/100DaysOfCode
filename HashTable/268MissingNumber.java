class Solution {
    public int missingNumber(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            map.put(nums[i], 1);
        }    

        for (int j=0; j<=nums.length; j++)
        {
            if (!map.containsKey(j))
            {
                return j;
            }
        }
        return -1;
    }
}