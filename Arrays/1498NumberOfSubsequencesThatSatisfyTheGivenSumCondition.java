class Solution {
    public int numSubseq(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length-1;

        int[] array = new int[nums.length];
        array[0] = 1;

        for (int i=1; i<nums.length; i++)
        {
            array[i] = array[i-1] * 2 % 1000000007;
        }
        
        while (left <= right) 
        {
            if (nums[left] + nums[right] > target) 
            {
                right--;
            } 
            else 
            {
                count = (count + array[right - left]) % 1000000007;
                left++;
            }
        }
        
        return count;    
    }
}