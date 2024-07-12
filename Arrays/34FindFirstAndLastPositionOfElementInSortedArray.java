class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] array = new int[2];
        array[0] = -1;
        array[1] = -1;

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == target)
            {
                array[0] = i;
                break;
            }
        }

        for (int i=nums.length-1; i>=0; i--)
        {
            if (nums[i] == target)
            {
                array[1] = i;
                break;
            }
        }
        return array;       
    }
}