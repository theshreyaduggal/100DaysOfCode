class Solution {
    public int minimumOperations(int[] nums) 
    {
        if (nums.length == 1 && nums[0] == 0)
        {
            return 0;
        }

        int count = 0;

        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++)
        {
            int num = nums[i];
            if (nums[i] == 0)
            {
                continue;
            }
            for (int j=i; j<nums.length; j++)
            {
                nums[j] = nums[j] - num;
            }
            count++;
        }
        return count;    
    }
}