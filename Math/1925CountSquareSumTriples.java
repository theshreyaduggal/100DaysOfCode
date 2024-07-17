class Solution {
    public int countTriples(int n) 
    {
        int count = 0;
        for (int i=1; i<=n; i++)
        {
            for (int j=i+1; j<=n; j++)
            {
                int num = (i*i) + (j*j);
                int ans = (int) Math.sqrt(num);
            
                if ((ans*ans) == num && ans<=n)
                {
                    count = count+2;
                }
            }
        } 
        return count;   
    }
}