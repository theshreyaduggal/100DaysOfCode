class Solution {
    public int search(int[] nums, int target) 
    {
        int beg = 0;
        int end = nums.length-1;
        while (beg <= end)
        {
            int mid = (beg + (end-beg)/2);
            if (nums[mid] == target)
            {
                return mid;
            }
            if (nums[mid] < target)
            {
                beg = mid + 1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1; 
    }
}