class Solution {
    public double new21Game(int n, int k, int maxPts) 
    {
        if(k == 0 || n >= k+maxPts)
        {
            return 1.0;
        }

        double storage[] = new double[n+1]; 
        storage[0] = 1.0;

        double sum = 1.0;
        double res = 0.0;

        for(int i=1; i<=n; i++) 
        {
            storage[i] = sum/maxPts;
            
            if (i < k)
            {
                sum = sum + storage[i];
            }
            else
            {
                res = res + storage[i];
            }
            
            if (i-maxPts >= 0)
            {
                sum = sum - storage[i-maxPts];
            }
        }

        return res;    
    }
}