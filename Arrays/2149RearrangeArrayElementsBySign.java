class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int[] array = new int[nums.length];
        int k=1;
        int l=0;

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] < 0)
            {
                array[k] = nums[i];
                k = k+2;
            }
            else
            {
                array[l] = nums[i];
                l = l+2;
            }
        }    
        return array;
    }
}