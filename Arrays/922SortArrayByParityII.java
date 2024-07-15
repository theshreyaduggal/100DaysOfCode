class Solution {
    public int[] sortArrayByParityII(int[] nums) 
    {
        for (int i=0, j=1; i<nums.length && j<nums.length;)
        {
            if (nums[i]%2 != 0 && nums[j] % 2==0)
            {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
            }
            else if (nums[i]%2 !=0)
            {
               j=j+2;
            }
            else if (nums[i]%2 == 0)
            {
                i=i+2;
            }
        }
        return nums;   
    }
}