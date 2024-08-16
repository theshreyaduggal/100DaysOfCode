class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) 
    {
        int n = arr.length;
        double low = ((double)arr[0])/arr[n-1];  
        double high = 1;

        while(low <= high)
        {
            double mid = (low + high)/2;
            int count[] = fraction(arr, mid);

            if(count[0] == k)
            {
                return new int[]{count[1],count[2]};
            }
            else if(count[0] < k)
            {
                low = mid;
            }
            else
            {
                high = mid;
            }
        }
        
        return new int[0];
    }

    public int[] fraction(int[] arr , double target)
    {
        int count =0;
        int num1 = arr[0];
        int num2 = arr[arr.length-1];
        int j = 0;

        for(int i=1; i<arr.length; i++)
        {
            while(arr[j] <= arr[i]*target)
            {
                j++;
            }
            
            count = count + j;
              
            if (j>0 && arr[j-1]*num2 >= arr[i]*num1)
            {
                num1 = arr[j-1];
                num2 = arr[i];
            }
        }

        return new int[]{count , num1 , num2};
    }
}