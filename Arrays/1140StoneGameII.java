class Solution {
    public int stoneGameII(int[] piles) 
    {
        int n = piles.length;
        int[][] storage = new int[n][n + 1];

        int[] sum = new int[n];
        sum[n-1] = piles[n-1];
        
        for (int i=n-2; i>= 0; i--) 
        {
            sum[i] = sum[i+1] + piles[i];
        }
        
        for (int i=n-1; i>= 0; i--) 
        {
            for (int j=1; j<=n; j++) 
            {
                if (i + 2*j >= n) 
                {
                    storage[i][j] = sum[i];
                } 
                else 
                {
                    for (int x=1; x<=2*j; x++) 
                    {
                        storage[i][j] = Math.max(storage[i][j], sum[i]-storage[i+x][Math.max(j, x)]);
                    }
                }
            }
        }
        
        return storage[0][1];    
    }
}