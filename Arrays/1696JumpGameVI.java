class Solution {
    public int maxResult(int[] nums, int k) 
    { 
        int[] storage = new int[nums.length];
        storage[0] = nums.length-1;

        int a = 0;
        int b = 0;

        for (int i=nums.length-2; i>= 0; i--) 
        {
            if (storage[a]-i > k) 
            {
                a++;
            }

            nums[i] = nums[i] + nums[storage[a]];
            while (b >= a && nums[storage[b]] <= nums[i]) 
            {
                b--;
            }
            b++;
            storage[b] = i;
        }
        return nums[0];
    }
}