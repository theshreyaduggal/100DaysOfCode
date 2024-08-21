class Solution {
    public int strangePrinter(String s) 
    {
        int n = s.length();
        int[][] storage = new int[n+1][n+1];
        
        for (int i=n-1; i>=0; i--) 
        {
            for (int j=i; j<n; j++) 
            {
                int num = 1 + storage[i+1][j];

                for (int k=i+1; k<=j; k++) 
                {
                    if (s.charAt(i) == s.charAt(k)) 
                    {
                        num = Math.min(num, storage[i][k-1] + storage[k+1][j]);
                    }
                }

                storage[i][j] = num;
            }
        }
        
        return storage[0][n-1];    
    }
}