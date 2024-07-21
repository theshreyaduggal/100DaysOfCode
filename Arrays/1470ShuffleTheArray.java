class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] array = new int[nums.length];
        int k=0;

        for (int i=0, j=n; i<n && j<nums.length; i++, j++)
        {
            array[k] = nums[i];
            array[k+1] = nums[j];
            k=k+2;
        }
        return array;
    }
}