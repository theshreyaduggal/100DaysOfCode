class Solution {
    public int rob(int[] nums) 
    {
        if (nums.length == 1) 
        {
            return nums[0];
        }

        int[] storage = new int[nums.length];

        storage[0] = nums[0];
        storage[1] = Math.max(nums[0], nums[1]);

        for (int i=2; i<nums.length; i++)
		{
            storage[i] = Math.max(storage[i - 1], nums[i]+storage[i - 2]);
        }

        return storage[nums.length - 1];       
    }
}