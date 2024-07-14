class Solution {
    public void rotate(int[] nums, int k) 
    {
        k= k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);    
    }
    public void reverse(int[] nums, int index1, int index2)
    {
        while (index1 < index2)
        {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
            index1++;
            index2--;
        }
    }
}