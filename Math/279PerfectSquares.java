class Solution {
    public int numSquares(int n) 
    {
        int[] temp = new int[n+1];
        temp[0] = 0;
        temp[1] = 1;

        for(int i=2; i<=n; i++) 
        {
            int min = Integer.MAX_VALUE;

            for(int j=1; j*j<=i; j++) 
            {
                int num = i - j*j;
                
                if(temp[num] < min) 
                {
                    min = temp[num];
                }
            }
            temp[i] = min + 1;
        }
        return temp[n];    
    }
}