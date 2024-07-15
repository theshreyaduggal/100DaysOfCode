class Solution {
    public int specialArray(int[] nums) 
    {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length;

        while (start <= end)
        {
            int mid = start + (end-start)/2;
            int ans = countNum(nums, mid);

            if (ans == mid)
            {
                return mid;
            }
            else if (ans > mid)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int countNum (int[] nums, int target)
    {
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] >= target)
            {
                count++;
            }
        }
        return count;
    }    
}