class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        int[] ans = new int[2];
        for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                if (nums[i] == nums[j])
                {
                    ans[0] = nums[i];
                    break;
                }
            }
        } 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            map.put(nums[i], 1);
        }    

        for (int j=0; j<=nums.length; j++)
        {
            if (!map.containsKey(j))
            {
                ans[1] = j;
            }
        } 
        return ans;  
    }
}