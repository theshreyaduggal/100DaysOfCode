class Solution {
    public int countNumbersWithUniqueDigits(int n) 
    {
        int[] storage = new int[n+1];
        storage[0] = 1;

        for(int i=1; i<=n; i++)
        {
            int x = 9;
            int y = 9;
            int c = i;
            
            while(c-- > 1) 
            {
                x = x * y--;
            }

            storage[i] = storage[i-1] + x;
        }
        return storage[n];    
    }
}