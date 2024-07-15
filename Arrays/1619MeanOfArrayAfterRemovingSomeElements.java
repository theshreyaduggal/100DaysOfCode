class Solution {
    public double trimMean(int[] arr) 
    {
        Arrays.sort(arr);
        int percent = (int) (0.05 * arr.length);
        double length = arr.length-(percent*2);
        double sum = 0;

        for (int i=percent; i<(arr.length-percent); i++)
        {
            sum = sum + arr[i];
        } 

        double mean = (double) (sum/length); 
        return mean;  
    }
}