class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int sum = 0;
        int n = arr.length;
        
        for (int i=0; i<arr.length; i++)
        {
            int end = i+1;
            int start = n-i;
            int totalSubArrays = start * end;
            int oddSubArrays = totalSubArrays/2;
            if (totalSubArrays % 2 == 1)
            {
                oddSubArrays++;
            }   
            sum = sum + (oddSubArrays * arr[i]);
        }    
        return sum;
    }
}