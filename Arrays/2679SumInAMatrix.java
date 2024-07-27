class Solution {
    public int matrixSum(int[][] nums) 
    {
        int sum = 0;
        int rows = nums.length;
        int cols = nums[0].length;

        for(int[] num :nums)
        {
            Arrays.sort(num);
        }
        for(int i=0; i<cols; i++)
        {
            int max = 0;
            for(int j=0; j<rows; j++)
            {
                max = Math.max(max, nums[j][i]);
            }
            sum = sum + max;
        }
        return sum;    
    }
}