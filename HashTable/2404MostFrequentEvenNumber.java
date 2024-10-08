class Solution {
    public int mostFrequentEven(int[] nums) 
    {
        int count = 0;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
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
        for (int i=0; i<nums.length; i++)
        {
            if ((nums[i]%2==0 && map.get(nums[i])>count) || (map.get(nums[i])==count && ans>nums[i] && nums[i]%2==0))
            {
                count = map.get(nums[i]);
                ans = nums[i];
            }
        }
        if (ans == -1)
        {
            return -1;
        }
        return ans;
    }
}