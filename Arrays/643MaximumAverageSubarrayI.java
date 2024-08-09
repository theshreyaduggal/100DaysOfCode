class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int n = nums.length;
        double max = 0;
        int sum = 0;

        for(int i=0; i<k; i++)
        {
            sum = sum + nums[i];
        }

        max = (double)sum/k;

        int m = 0;
        int j = k;

        while(j<n)
        {
            sum = sum - nums[m];
            sum = sum + nums[j];

            max = Math.max(max, (double)sum/k);
            m++;
            j++;
        }

        return max;    
    }
}