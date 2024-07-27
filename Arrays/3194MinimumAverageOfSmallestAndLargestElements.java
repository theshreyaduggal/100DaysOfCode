class Solution {
    public double minimumAverage(int[] nums) 
    {
        double[] averages = new double[nums.length/2];
        Arrays.sort(nums);
        int n = nums.length-1;

        for (int i=0; i<nums.length/2; i++)
        {
            double avg = (double)(nums[i] + nums[n-i])/2;
            averages[i] = avg;
        }   
        Arrays.sort(averages);
        return averages[0];
    }
}