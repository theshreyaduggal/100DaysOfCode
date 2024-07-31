class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] array = new int[nums.length];
        int k = 0;
        int j = nums.length-1;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
                array[k] = nums[i];
                k++;
            }
            else
            {
                array[j] = nums[i];
                j--; 
            }
        }    
        return array;
    }
}