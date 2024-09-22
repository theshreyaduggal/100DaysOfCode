class Solution {
    public int findKthNumber(int n, int k) 
    {
        int num = 1;
        k--;  
        
        while (k > 0) 
        {
            int count = countNumbers(num, n);
            
            if (k >= count) 
            {
                num++;  
                k = k - count;
            } 
            else 
            {
                num = num * 10;  
                k--;
            }
        }
        
        return num;
    }

    public int countNumbers(long prefix, int n) 
    {
        long next = prefix + 1;
        long totalCount = 0;

        while (prefix <= n) 
        {
            totalCount = totalCount + Math.min(n+1, next) - prefix;
            prefix = prefix * 10;
            next = next * 10;
        }

        return (int)totalCount;    
    }
}