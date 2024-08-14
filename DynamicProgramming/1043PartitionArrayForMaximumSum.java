class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) 
    {
        int storage[] = new int[arr.length+1];
    
        for (int i=arr.length-1; i>=0; i--) 
        {
            int max = Integer.MIN_VALUE;
            int ans = Integer.MIN_VALUE;
            int count = 0;

            for (int j=i; j<i+k && j<arr.length; j++) 
            {
                count++;
                max = Math.max(arr[j], max);

                int sum = max * count + storage[j + 1];
                ans = Math.max(ans, sum);
            }
        
            storage[i] = ans;
        }
    
        return storage[0];    
    }
}