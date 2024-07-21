class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];  
        int[] sumArray = new int[nums.length];

        leftSum[0] = 0;
        rightSum[rightSum.length-1] = 0;

        for (int i=1; i<nums.length; i++)
        {
            leftSum[i] = nums[i-1] + leftSum[i-1];
        } 

        for (int j=0; j<nums.length; j++)
        {
            int sum = 0;
           for (int k=j+1; k<nums.length; k++)
           {
              sum = sum + nums[k];
           }
           rightSum[j] = sum;
        }

        for (int n=0; n<nums.length; n++)
        {
            sumArray[n] = Math.abs(leftSum[n] - rightSum[n]);
        }
        return sumArray;
    }
}