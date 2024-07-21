class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int sum = 0;
        int max = 0;
        int ans = 0;
        for (int i=0; i<weights.length; i++) 
        {
            sum = sum + weights[i];
            max = Math.max(max, weights[i]);
        }
        if (weights.length == days) 
        {
            return max;
        }

        int start = max;
        int end = sum;
        while (start <= end) 
        {
            int mid = start + (end - start) / 2;
            
            if (findPackage(weights, mid, days)) 
            {
                ans = mid;
                end = mid - 1;
            } 
            else 
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean findPackage(int[] weights, int mid, int days) 
    {
        int day = 1;
        int sum = 0;
        
        for (int i=0; i<weights.length; i++) 
        {
            sum = sum + weights[i];
            if (sum > mid) 
            {
                day++;
                sum = weights[i];
            }
        }
        return day <= days;
    }
}