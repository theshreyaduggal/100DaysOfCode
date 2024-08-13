class Solution {
    public int tribonacci(int n) 
    {
        if(n < 2)
        {
            return n;
        }       
        else if(n == 3)
        {
            return 2;
        }

        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        storage[2] = 1;

        for(int i=3; i<=n; i++)
        {
            storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
        }

        return storage[n];    
    }
}