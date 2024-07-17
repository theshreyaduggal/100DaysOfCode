class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        int prod = 1;

        for (int i=0; i<nums.length; i++)
        {
            ans[i] = ans[0] * prod;
            prod = prod * nums[i];
        }

        prod = 1;
        for (int i=nums.length-1; i>=0; i--)
        {
            ans[i] = ans[i] * prod;
            prod = prod * nums[i];
        }    

        return ans;
    }
}